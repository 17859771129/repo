package com.ylz.hf.sync.kafka;

import com.ylz.person.service.impl.PatientInfoServiceImpl;
import com.ylz.person.service.impl.PatientVisitServiceImpl;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class PatientConsumer {

    private static final Logger log = LoggerFactory.getLogger(PatientConsumer.class);

    @Autowired
    private PatientInfoServiceImpl patientInfoService;
    @Autowired
    private PatientVisitServiceImpl patientVisitService;

    @KafkaListener(topics = "PATIENT")
    public void patientMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.info("接收数据是：{}", message);
        boolean isSuccess = patientInfoService.insertData(message);
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }


    @KafkaListener(topicPattern = "PATIENT_VISIT")
    public void visitMessage(ConsumerRecord<String, String> data, Acknowledgment acknowledgment) {
        String message = data.value();
        log.info("接收数据是：{}", message);
        boolean isSuccess = patientVisitService.insertData(message);
        //数据处理成功提交offset
        if (isSuccess) {
            acknowledgment.acknowledge();//提交offset
        }
    }

}
