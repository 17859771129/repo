package com.ylz.hf.sync.kafka;

import com.ylz.common.tool.XmlUtil;
import com.ylz.dict.bean.DeptInfo;
import com.ylz.dict.service.impl.DeptInfoServiceImpl;
import com.ylz.hf.sync.vo.DeptVo;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class DeptConsumer {

    private static final Logger log = LoggerFactory.getLogger(DeptConsumer.class);

    @Autowired
    private DeptInfoServiceImpl deptInfoService;


    @KafkaListener(topicPattern = "DEPT")
    public void deptMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.debug("接收数据是：{}", message);
        DeptVo deptVo = new DeptVo();
        boolean isTrue = XmlUtil.setBeans(deptVo, message);
        boolean isSuccess = false;
        if (!isTrue) {
            log.error("topic为：DICT_ORGAN，offset为：{}，内容为：{}，数据格式错误", data.offset(), message);
            isSuccess = true;
        } else {
            DeptInfo deptInfo = setDictInfo(deptVo);
            isSuccess = deptInfoService.mergeData(deptInfo);
        }
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }

    private DeptInfo setDictInfo(DeptVo deptVo) {
        DeptInfo deptInfo = new DeptInfo();
        BeanUtils.copyProperties(deptVo, deptInfo);
        return deptInfo;
    }

}
