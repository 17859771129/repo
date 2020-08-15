package com.ylz.hf.write.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service("kafkaService")
public class KafkaServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(KafkaServiceImpl.class);


    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendToKafka(String topicName, String message) {
        log.debug("send to kafka,the topic is {},the message is {}", topicName, message);
        kafkaTemplate.send(topicName, message);
    }
}
