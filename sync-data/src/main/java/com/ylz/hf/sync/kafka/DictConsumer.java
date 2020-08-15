package com.ylz.hf.sync.kafka;

import com.ylz.common.tool.XmlUtil;
import com.ylz.dict.bean.DictInfo;
import com.ylz.dict.service.impl.DictInfoServiceImpl;
import com.ylz.hf.sync.vo.DictVo;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class DictConsumer {

    private static final Logger log = LoggerFactory.getLogger(DictConsumer.class);

    @Autowired
    private DictInfoServiceImpl dictInfoService;


    @KafkaListener(topicPattern = "DICT_ORGAN")
    public void dictMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.debug("接收数据是：{}", message);
        DictVo dictVo = new DictVo();
        boolean isTrue = XmlUtil.setBeans(dictVo, message);
        boolean isSuccess = false;
        if (!isTrue) {
            log.error("topic为：DICT_ORGAN，offset为：{}，内容为：{}，数据格式错误", data.offset(), message);
            isSuccess = true;
        } else {
            DictInfo dictInfo = setDictInfo(dictVo);
            isSuccess = dictInfoService.mergeData(dictInfo);
        }
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }

    private DictInfo setDictInfo(DictVo dictVo) {
        DictInfo dictInfo = new DictInfo();
        BeanUtils.copyProperties(dictVo, dictInfo);
        return dictInfo;
    }

}
