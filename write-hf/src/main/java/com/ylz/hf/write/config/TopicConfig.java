package com.ylz.hf.write.config;

/**
 * @Description: 自动创建kafka标题
 * @Author: liuzemin
 * @Date: 2020/6/11 11:40
 * @version: 1
 * @modified By:
 **/

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建kafka的topic
 * 如果kafka不存在此topic则会自动创建，存在则不改变kafka的topic
 */
@Configuration
@EnableKafka
public class TopicConfig {


    public static final String TOPIC_JC_KAFKA_DEMO = "jc-demo-kafka";
    public static final String TOPIC_JC_KAFKA_TEST = "test";
    //******************************************************************
    //0 新生儿访视      HSDB01.02
    //1 出生医学证明    HSDB01.01
    //2 重性精神病患者登记信息  HSDB04.03
    //3 健康档案基本信息  HSDA00.01
    //4 入院基本信息数据  C0034
    //5 出院基本信息数据  C0053
    //6 门诊基本信息数据  急诊基本信息数据  PATIENT_VISIT
    //*******************************************************************
    // 1  C0034   入院记录
    //2  C0053   出院小结
    //3  HSDA00.01  个人基本健康信息登记
    //4  HSDB01.01  出生医学证明
    //5  HSDB01.02  新生儿家庭访视
    //6  HSDB01.03  儿童健康体检
    //7  HSDB04.03  重性精神病患者登记信息
    //重性精神病患者登记信息 2
    // ******************************************************************
    public static final String TOPIC_YLZ_KAFKA_TTTLE0 = "HSDB01.02";
    public static final String TOPIC_YLZ_KAFKA_TTTLE1 = "HSDB01.01";
    public static final String TOPIC_YLZ_KAFKA_TTTLE2 = "HSDB04.03";
    public static final String TOPIC_YLZ_KAFKA_TTTLE3 = "HSDA00.01";
    public static final String TOPIC_YLZ_KAFKA_TTTLE4 = "C0034";
    public static final String TOPIC_YLZ_KAFKA_TTTLE5 = "C0053";
    public static final String TOPIC_YLZ_KAFKA_TTTLE6 = "PATIENT_VISIT";

    @Value("${spring.kafka.bootstrap-servers}")
    String kaHost;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kaHost);
        return new KafkaAdmin(configs);
    }

    /* @Desc
    修改Topic分区数量
    为什么要更新Topic呢，例如我们上一章创建的“topic.qucik.demo”只有一个分区，
    后期我们想增加分区数来提高系统吞吐量，这样我们就需要修改一下Topic的分区数了。
    实现也非常简单，只需要修改在我们刚才编写的KafkaInitialConfiguration类的initialTopic()方法，
    紧接着重启一下项目即可。修改分区数并不会导致数据的丢失，但是分区数只能增大不能减小。
    **/
    @Bean
    public NewTopic Create_TOPIC_JC_KAFKA_DEMO() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_JC_KAFKA_DEMO, 1, (short) 1);
    }

    @Bean
    public NewTopic Create_TOPIC_JC_KAFKA_TEST() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_JC_KAFKA_TEST, 1, (short) 1);
    }

    /*public static final String TOPIC_YLZ_KAFKA_TTTLE0 = "HSDB01.02";
    public static final String TOPIC_YLZ_KAFKA_TTTLE1= "HSDB01.01";
    public static final String TOPIC_YLZ_KAFKA_TTTLE2 = "HSDB04.03";
    public static final String TOPIC_YLZ_KAFKA_TTTLE3 = "HSDA00.01";
    public static final String TOPIC_YLZ_KAFKA_TTTLE4 = "C0034";
    public static final String TOPIC_YLZ_KAFKA_TTTLE5 = "C0053";
    public static final String TOPIC_YLZ_KAFKA_TTTLE6= "PATIENT_VISIT";*/

    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE0() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE0, 1, (short) 1);
    }

    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE1() {
       /* 第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE1, 1, (short) 1);
    }

    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE2() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE2, 1, (short) 1);
    }


    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE3() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE3, 1, (short) 1);
    }


    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE4() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE4, 1, (short) 1);
    }


    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE5() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE5, 1, (short) 1);
    }


    @Bean
    public NewTopic Create_TOPIC_YLZ_KAFKA_TTTLE6() {
        /*第一个是参数是topic名字，第二个参数是分区个数，第三个是topic的复制因子个数
        当broker个数为1个时会创建topic失败，
        提示：replication factor: 2 larger than available brokers: 1
        只有在集群中才能使用kafka的备份功能
        以kafka的分区机制来说，我将其numParitions个数设置为broker个数，也就是3*/
        return new NewTopic(TOPIC_YLZ_KAFKA_TTTLE6, 1, (short) 1);
    }

}


/******************************************************************
 0 新生儿访视      HSDB01.02
 1 出生医学证明    HSDB01.01
 2 重性精神病患者登记信息  HSDB04.03
 3 健康档案基本信息  HSDA00.01
 4 入院基本信息数据  C0034
 5 出院基本信息数据  C0053
 6 门诊基本信息数据  急诊基本信息数据  PATIENT_VISIT
 *******************************************************************
 1  C0034   入院记录
 2  C0053   出院小结
 3  HSDA00.01  个人基本健康信息登记
 4  HSDB01.01  出生医学证明
 5  HSDB01.02  新生儿家庭访视
 6  HSDB01.03  儿童健康体检

 7  HSDB04.03  重性精神病患者登记信息
 重性精神病患者登记信息 2
 ******************************************************************/
