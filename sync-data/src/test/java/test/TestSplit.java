package test;

import com.ylz.hf.sync.SyncData;
import com.ylz.person.service.impl.PatientInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SyncData.class})
public class TestSplit {

    private static final Logger log = LoggerFactory.getLogger(TestSplit.class);
    @Autowired
    public PatientInfoServiceImpl patientInfoService;

    @Test
    public void splitData() {
        log.info("do ReSplitTask!");
        String message = "<PATIENT>" +
                "<SEND_ID>1.2.156.112747.002.001.100.2</SEND_ID>" +
                "<PATIENT_ID>1341</PATIENT_ID>" +
                "<PATIENT_NAME>王凤</PATIENT_NAME>" +
                "<NAME_SPELL></NAME_SPELL>" +
                "<DATE_OF_BIRTH>19880518</DATE_OF_BIRTH>" +
                "<IDENTITY_NO>350128198811123214</IDENTITY_NO>" +
                "<SEX_CODE>1</SEX_CODE>" +
                "<SEX>男</SEX>" +
                "<HOME_PLACE>平潭县小湖新村123号</HOME_PLACE>" +
                "<REGISTERED_PLACE></REGISTERED_PLACE>" +
                "<NATIVE_PLACE></NATIVE_PLACE>" +
                "<BIRTH_PLACE></BIRTH_PLACE>" +
                "<SOCIAL_SECURITY_NUMBER></SOCIAL_SECURITY_NUMBER>" +
                "<HEALTH_CARD_NUMBER></HEALTH_CARD_NUMBER>" +
                "<CITIZEN_CARD_NUMBER></CITIZEN_CARD_NUMBER>" +
                "<ETHNIC_CODE></ETHNIC_CODE>" +
                "<ETHNIC></ETHNIC>" +
                "<COUNTRY_CODE></COUNTRY_CODE>" +
                "<COUNTRY></COUNTRY>" +
                "<MEDICAL_INSURANCE_NUMBER></MEDICAL_INSURANCE_NUMBER>" +
                "<ELDER_CERTIFICATE_NUMBER></ELDER_CERTIFICATE_NUMBER>" +
                "<MEDICAL_RECORDS_NUMBER></MEDICAL_RECORDS_NUMBER>" +
                "<LANGUAGE_CODE></LANGUAGE_CODE>" +
                "<LANGUAGE></LANGUAGE>" +
                "<RELIGION_CODE></RELIGION_CODE>" +
                "<RELIGION></RELIGION>" +
                "<MARITAL_CODE>maritalStatusId</MARITAL_CODE>" +
                "<MARITAL>maritalStatusDepict</MARITAL>" +
                "<DEGREE_CODE></DEGREE_CODE>" +
                "<DEGREE></DEGREE>" +
                "<HOME_PHONE>15606918066</HOME_PHONE>" +
                "<HOME_ZIP_CODE></HOME_ZIP_CODE>" +
                "<REGISTERED_ZIP_CODE></REGISTERED_ZIP_CODE>" +
                "<BIRTH_ZIP_CODE></BIRTH_ZIP_CODE>" +
                "<NATIVE_ZIP_CODE></NATIVE_ZIP_CODE>" +
                "<EMAIL></EMAIL>" +
                "<IDENTITY></IDENTITY>" +
                "<IDENTITY_CODE></IDENTITY_CODE>" +
                "<WORK_ADDRESS></WORK_ADDRESS>" +
                "<WORK_PHONE>15606918066</WORK_PHONE>" +
                "<RELATION_ADDRESS></RELATION_ADDRESS>" +
                "<RELATION_NAME></RELATION_NAME>" +
                "<RELATION_PHONE></RELATION_PHONE>" +
                "<BLOOD_TYPE_CODE></BLOOD_TYPE_CODE>" +
                "<BLOOD_TYPE></BLOOD_TYPE>" +
                "<CERTIFICATES_NUMBER></CERTIFICATES_NUMBER>" +
                "<CHARGE_TYPE></CHARGE_TYPE>" +
                "<ALLERGY_INFORMATION></ALLERGY_INFORMATION>" +
                "<INSURANCE_TYPE></INSURANCE_TYPE>" +
                "<DEATH_TIME></DEATH_TIME>" +
                "<DEATH_IND></DEATH_IND>" +
                "<INSURANCE_TYPE_CODE></INSURANCE_TYPE_CODE>" +
                "<EFFECTIVE_TIME></EFFECTIVE_TIME>" +
                "<PROVINCE></PROVINCE>" +
                "<CITY></CITY>" +
                "<DISTRICT></DISTRICT>" +
                "<RURAL></RURAL>" +
                "<VILLAGE></VILLAGE>" +
                "<HOUSE_NUMBER></HOUSE_NUMBER>" +
                "<OCCUPATION_ID>15</OCCUPATION_ID>" +
                "<OCCUPATION_DEPICT>职员(职工)</OCCUPATION_DEPICT>" +
                "<COMPANY>福建易联众医卫信息技术有限公司</COMPANY>" +
                "<HEALTH_CARD_ORGANIZATION_CODE></HEALTH_CARD_ORGANIZATION_CODE>" +
                "<HEALTH_FILE_NUMBER></HEALTH_FILE_NUMBER>" +
                "<ARCHIVING_ORGANIZATION_CODE></ARCHIVING_ORGANIZATION_CODE>" +
                "<PROVIDER_ORGANIZATION_ID>1001</PROVIDER_ORGANIZATION_ID>" +
                "<PROVIDER_ORGANIZATION_NAME>平潭综合实验区岚城乡卫生院</PROVIDER_ORGANIZATION_NAME>" +
                "<STATUS_CODE>active</STATUS_CODE>" +
                "<HOME_PROVINCE></HOME_PROVINCE>" +
                "<HOME_CITY></HOME_CITY>" +
                "<HOME_COUNTY></HOME_COUNTY>" +
                "<HOME_RURAL></HOME_RURAL>" +
                "<HOME_TOWNSHIP></HOME_TOWNSHIP>" +
                "<HOME_DISTRICT></HOME_DISTRICT>" +
                "<HOME_VILLAGE></HOME_VILLAGE>" +
                "<HOME_STREET_NAME></HOME_STREET_NAME>" +
                "<HOME_HOUSE_NUMBER></HOME_HOUSE_NUMBER>" +
                "<REGISTER_PROVINCE></REGISTER_PROVINCE>" +
                "<REGISTER_CITY></REGISTER_CITY>" +
                "<REGISTER_COUNTY></REGISTER_COUNTY>" +
                "<REGISTER_TOWNSHIP></REGISTER_TOWNSHIP>" +
                "<REGISTER_STREET_NAME></REGISTER_STREET_NAME>" +
                "<REGISTER_DISTRICT></REGISTER_DISTRICT>" +
                "<REGISTER_RURAL></REGISTER_RURAL>" +
                "<REGISTER_VILLAGE></REGISTER_VILLAGE>" +
                "<REGISTER_HOUSE_NUMBER></REGISTER_HOUSE_NUMBER>" +
                "<NATIVE_PROVINCE></NATIVE_PROVINCE>" +
                "<NATIVE_CITY></NATIVE_CITY>" +
                "<WORK_ZIP_CODE></WORK_ZIP_CODE>" +
                "<WORK_PROVINCE></WORK_PROVINCE>" +
                "<WORK_CITY></WORK_CITY>" +
                "<WORK_COUNTY></WORK_COUNTY>" +
                "<WORK_RURAL></WORK_RURAL>" +
                "<WORK_TOWNSHIP></WORK_TOWNSHIP>" +
                "<WORK_DISTRICT></WORK_DISTRICT>" +
                "<WORK_VILLAGE></WORK_VILLAGE>" +
                "<WORK_STREET_NAME></WORK_STREET_NAME>" +
                "<WORK_HOUSE_NUMBER></WORK_HOUSE_NUMBER>" +
                "<BIRTH_PROVINCE></BIRTH_PROVINCE>" +
                "<BIRTH_CITY></BIRTH_CITY>" +
                "<BIRTH_COUNTY></BIRTH_COUNTY>" +
                "<BIRTH_RURAL></BIRTH_RURAL>" +
                "<BIRTH_TOWNSHIP></BIRTH_TOWNSHIP>" +
                "<BIRTH_DISTRICT></BIRTH_DISTRICT>" +
                "<BIRTH_VILLAGE></BIRTH_VILLAGE>" +
                "<BIRTH_STREET_NAME></BIRTH_STREET_NAME>" +
                "<BIRTH_HOUSE_NUMBER></BIRTH_HOUSE_NUMBER>" +
                "<RELATION_VILLAGE></RELATION_VILLAGE>" +
                "<RELATION_PROVINCE></RELATION_PROVINCE>" +
                "<RELATION_HOUSE_NUMBER></RELATION_HOUSE_NUMBER>" +
                "<RELATION_CITY></RELATION_CITY>" +
                "<RELATION_COUNTY></RELATION_COUNTY>" +
                "<RELATION_RURAL></RELATION_RURAL>" +
                "<AGE></AGE>" +
                "<AGE_UNIT></AGE_UNIT>" +
                "<PHONE_NUMBER></PHONE_NUMBER>" +
                "<CREATE_TIME></CREATE_TIME>" +
                "<GENETIC_DISEASE_HISTORY></GENETIC_DISEASE_HISTORY>" +
                "<OPERATION_HISTORY></OPERATION_HISTORY>" +
                "<CREATE_OPERATOR></CREATE_OPERATOR>" +
                "<HEALTH_CARD_CREATE_TIME></HEALTH_CARD_CREATE_TIME>" +
                "<HEALTH_CARD_END_DATE></HEALTH_CARD_END_DATE>" +
                "<COOPERATIVE_NO></COOPERATIVE_NO>" +
                "</PATIENT>";
        log.debug("接收数据是：{}", message);
        boolean isSuccess = patientInfoService.insertData(message);
    }
}
