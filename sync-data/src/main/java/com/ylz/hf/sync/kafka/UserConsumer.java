package com.ylz.hf.sync.kafka;

import com.ylz.common.tool.XmlUtil;
import com.ylz.hf.sync.vo.UserVo;
import com.ylz.manager.bean.ManagerUser;
import com.ylz.manager.service.impl.UserServiceImpl;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    private static final Logger log = LoggerFactory.getLogger(UserConsumer.class);

    @Autowired
    private UserServiceImpl userService;

    @KafkaListener(topicPattern = "PERSONNEL")
    public void visitMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.info("接收数据是：{}", message);
        UserVo userVo = new UserVo();
        boolean isTrue = XmlUtil.setBeans(userVo, message);
        boolean isSuccess = false;
        if (!isTrue) {
            log.error("topic为：PERSONNEL，offset为：{}，内容为：{}，数据格式错误", data.offset(), message);
            isSuccess = true;
        } else {
            try {
                ManagerUser managerUser = setUser(userVo);
                isSuccess = userService.mergeData(managerUser);
            } catch (Exception e) {
                isSuccess = false;
            }
        }
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }

    private ManagerUser setUser(UserVo userVo) throws Exception {
        ManagerUser managerUser = new ManagerUser();
        BeanUtils.copyProperties(userVo, managerUser);
        switch (userVo.getStatusCode()) {
            case "active":
                managerUser.setFlag("1");
                break;
            case "disable":
                managerUser.setFlag("0");
                break;
            default:
                log.error("{}不符合要求", userVo.getStatusCode());
                throw new Exception("status_code传值为：" + userVo.getStatusCode());
        }
        return managerUser;
    }

}
