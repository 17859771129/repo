package com.ylz.hf.sync.kafka;

import com.ylz.common.tool.XmlUtil;
import com.ylz.dict.bean.DomainInfo;
import com.ylz.dict.service.impl.DomainInfoServiceImpl;
import com.ylz.hf.sync.vo.DomainVo;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class DomainConsumer {

    private static final Logger log = LoggerFactory.getLogger(DomainConsumer.class);

    @Autowired
    private DomainInfoServiceImpl domainInfoService;

    @KafkaListener(topicPattern = "DOMAIN_ID")
    public void domainMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.debug("接收数据是：{}", message);
        DomainVo domainVo = new DomainVo();
        boolean isTrue = XmlUtil.setBeans(domainVo, message);
        boolean isSuccess = false;
        if (!isTrue) {
            log.error("topic为：DOMAIN_ID，offset为：{}，内容为：{}，数据格式错误", data.offset(), message);
            isSuccess = true;
        } else {
            DomainInfo domainInfo = setDomainInfo(domainVo);
            isSuccess = domainInfoService.mergeData(domainInfo);
        }
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }

    private DomainInfo setDomainInfo(DomainVo domainVo) {
        DomainInfo domainInfo = new DomainInfo();
        BeanUtils.copyProperties(domainVo, domainInfo);
        return domainInfo;
    }

}
