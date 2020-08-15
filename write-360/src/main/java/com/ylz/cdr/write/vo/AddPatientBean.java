package com.ylz.cdr.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/PATIENT")
public class AddPatientBean {

    /**
     * 患者在该机构内的唯一id
     */
    @XMLObject(xpath = "./PATIENT_ID", ntype = XMLObject.TEXT)
    private String patientId;

    /**
     * 病人域ID
     */
    @XMLObject(xpath = "./SEND_ID", ntype = XMLObject.TEXT)
    private String patientDomainId;


    @XMLObject(xpath = "./GLOBAL_ID", ntype = XMLObject.TEXT)
    private String globalId;

    /**
     * 患者姓名
     */
    @XMLObject(xpath = "./PATIENT_NAME", ntype = XMLObject.TEXT)
    private String patientName;

    /**
     * 姓名拼写
     */
    @XMLObject(xpath = "./NAME_SPELL", ntype = XMLObject.TEXT)
    private String nameSpell;

    /**
     * 生日 yyyy-dd-mm
     */
    @XMLObject(xpath = "./DATE_OF_BIRTH", ntype = XMLObject.TEXT)
    private String dateOfBirth;

    /**
     * 身份证号
     */
    @XMLObject(xpath = "./IDENTITY_NO", ntype = XMLObject.TEXT)
    private String identityNo;

    /**
     * 居住地/联系地（全）
     */
    @XMLObject(xpath = "./HOME_PLACE", ntype = XMLObject.TEXT)
    private String homePlace;

    /**
     * 户口所在地(全)
     */
    @XMLObject(xpath = "./REGISTERED_PLACE", ntype = XMLObject.TEXT)
    private String registeredPlace;

    /**
     * 籍贯(全)
     */
    @XMLObject(xpath = "./NATIVE_PLACE", ntype = XMLObject.TEXT)
    private String nativePlace;

    /**
     * 出生地(全)
     */
    @XMLObject(xpath = "./BIRTH_PLACE", ntype = XMLObject.TEXT)
    private String birthPlace;

    /**
     * 社保号
     */
    @XMLObject(xpath = "./SOCIAL_SECURITY_NUMBER", ntype = XMLObject.TEXT)
    private String socialSecurityNumber;

    /**
     * 健康卡号
     */
    @XMLObject(xpath = "./HEALTH_CARD_NUMBER", ntype = XMLObject.TEXT)
    private String healthCardNumber;

    /**
     * 市民卡号
     */
    @XMLObject(xpath = "./CITIZEN_CARD_NUMBER", ntype = XMLObject.TEXT)
    private String citizenCardNumber;

    /**
     * 性别代码
     */
    @XMLObject(xpath = "./SEX_CODE", ntype = XMLObject.TEXT)
    private String sexCode;

    /**
     * 性别(男,女,其它)
     */
    @XMLObject(xpath = "./SEX", ntype = XMLObject.TEXT)
    private String sex;

    /**
     * 民族代码
     */
    @XMLObject(xpath = "./ETHNIC_CODE", ntype = XMLObject.TEXT)
    private String ethnicCode;

    /**
     * 民族
     */
    @XMLObject(xpath = "./ETHNIC", ntype = XMLObject.TEXT)
    private String ethnic;

    /**
     * 国籍代码
     */
    @XMLObject(xpath = "./COUNTRY_CODE", ntype = XMLObject.TEXT)
    private String countryCode;

    /**
     * 国籍
     */
    @XMLObject(xpath = "./COUNTRY", ntype = XMLObject.TEXT)
    private String country;

    /**
     * 医保卡号
     */
    @XMLObject(xpath = "./MEDICAL_INSURANCE_NUMBER", ntype = XMLObject.TEXT)
    private String medicalInsuranceNumber;

    /**
     * 老人卡号
     */
    @XMLObject(xpath = "./ELDER_CERTIFICATE_NUMBER", ntype = XMLObject.TEXT)
    private String elderCertificateNumber;

    /**
     * 病历卡号
     */
    @XMLObject(xpath = "./MEDICAL_RECORDS_NUMBER", ntype = XMLObject.TEXT)
    private String medicalRecordsNumber;

    /**
     * 语言代码
     */
    @XMLObject(xpath = "./LANGUAGE_CODE", ntype = XMLObject.TEXT)
    private String languageCode;

    /**
     * 语言
     */
    @XMLObject(xpath = "./LANGUAGE", ntype = XMLObject.TEXT)
    private String language;

    /**
     * 宗教代码
     */
    @XMLObject(xpath = "./RELIGION_CODE", ntype = XMLObject.TEXT)
    private String religionCode;

    /**
     * 宗教
     */
    @XMLObject(xpath = "./RELIGION", ntype = XMLObject.TEXT)
    private String religion;

    /**
     * 婚姻代码
     */
    @XMLObject(xpath = "./MARITAL_CODE", ntype = XMLObject.TEXT)
    private String maritalCode;

    /**
     * 婚姻(已婚,未婚,离异,丧偶,其它)
     */
    @XMLObject(xpath = "./MARITAL", ntype = XMLObject.TEXT)
    private String marital;

    /**
     * 学历代码
     */
    @XMLObject(xpath = "./DEGREE_CODE", ntype = XMLObject.TEXT)
    private String degreeCode;

    /**
     * 学历
     */
    @XMLObject(xpath = "./DEGREE", ntype = XMLObject.TEXT)
    private String degree;

    /**
     * 家庭联系电话
     */
    @XMLObject(xpath = "./HOME_PHONE", ntype = XMLObject.TEXT)
    private String homePhone;

    /**
     * 居住地/联系地邮编
     */
    @XMLObject(xpath = "./HOME_ZIP_CODE", ntype = XMLObject.TEXT)
    private String homeZipCode;

    /**
     * 户口所在地邮编
     */
    @XMLObject(xpath = "./REGISTERED_ZIP_CODE", ntype = XMLObject.TEXT)
    private String registeredZipCode;

    /**
     * 出生地邮编
     */
    @XMLObject(xpath = "./BIRTH_ZIP_CODE", ntype = XMLObject.TEXT)
    private String birthZipCode;

    /**
     * 籍贯邮编
     */
    @XMLObject(xpath = "./NATIVE_ZIP_CODE", ntype = XMLObject.TEXT)
    private String nativeZipCode;

    /**
     * 邮箱
     */
    @XMLObject(xpath = "./EMAIL", ntype = XMLObject.TEXT)
    private String email;

    /**
     * 身份
     */
    @XMLObject(xpath = "./IDENTITY", ntype = XMLObject.TEXT)
    private String identity;

    /**
     * 身份代码
     */
    @XMLObject(xpath = "./IDENTITY_CODE", ntype = XMLObject.TEXT)
    private String identityCode;

    /**
     * 单位地址
     */
    @XMLObject(xpath = "./WORK_ADDRESS", ntype = XMLObject.TEXT)
    private String workAddress;

    /**
     * 工作联系电话
     */
    @XMLObject(xpath = "./WORK_PHONE", ntype = XMLObject.TEXT)
    private String workPhone;

    /**
     * 联系人地址
     */
    @XMLObject(xpath = "./RELATION_ADDRESS", ntype = XMLObject.TEXT)
    private String relationAddress;

    /**
     * 联系人姓名
     */
    @XMLObject(xpath = "./RELATION_NAME", ntype = XMLObject.TEXT)
    private String relationName;

    /**
     * 联系人电话
     */
    @XMLObject(xpath = "./RELATION_PHONE", ntype = XMLObject.TEXT)
    private String relationPhone;

    /**
     * 联系人邮编
     */
    @XMLObject(xpath = "./RELATION_ZIP_CODE", ntype = XMLObject.TEXT)
    private String relationZipCode;

    /**
     * 血型代码
     */
    @XMLObject(xpath = "./BLOOD_TYPE_CODE", ntype = XMLObject.TEXT)
    private String bloodTypeCode;

    /**
     * 血型
     */
    @XMLObject(xpath = "./BLOOD_TYPE", ntype = XMLObject.TEXT)
    private String bloodType;

    /**
     * 证件代码
     */
    @XMLObject(xpath = "./CERTIFICATES_TYPE_CODE", ntype = XMLObject.TEXT)
    private String certificatesTypeCode;

    /**
     * 证件号
     */
    @XMLObject(xpath = "./CERTIFICATES_NUMBER", ntype = XMLObject.TEXT)
    private String certificatesNumber;

    /**
     * 费用类别
     */
    @XMLObject(xpath = "./CHARGE_TYPE", ntype = XMLObject.TEXT)
    private String chargeType;

    /**
     * 过敏信息
     */
    @XMLObject(xpath = "./ALLERGY_INFORMATION", ntype = XMLObject.TEXT)
    private String allergyInformation;


    /**
     * 医保类型
     */
    @XMLObject(xpath = "./INSURANCE_TYPE", ntype = XMLObject.TEXT)
    private String insuranceType;

    /**
     * 死亡时间
     */
    @XMLObject(xpath = "./DEATH_TIME", ntype = XMLObject.TEXT)
    private String deathTime;

    /**
     * 死亡标识
     */
    @XMLObject(xpath = "./DEATH_IND", ntype = XMLObject.TEXT)
    private String deathInd;

    /**
     * 医保代码
     */
    @XMLObject(xpath = "./INSURANCE_TYPE_CODE", ntype = XMLObject.TEXT)
    private String insuranceTypeCode;

    /**
     * 患者登记时间
     */
    @XMLObject(xpath = "./EFFECTIVE_TIME", ntype = XMLObject.TEXT)
    private String effectiveTime;

    /**
     * 证件类别描述
     */
    @XMLObject(xpath = "./CERTIFICATES_TYPE_DEPICT", ntype = XMLObject.TEXT)
    private String certificatesTypeDepict;

    /**
     * 省
     */
    @XMLObject(xpath = "./PROVINCE", ntype = XMLObject.TEXT)
    private String province;

    /**
     * 市
     */
    @XMLObject(xpath = "./CITY", ntype = XMLObject.TEXT)
    private String city;

    /**
     * 区
     */
    @XMLObject(xpath = "./DISTRICT", ntype = XMLObject.TEXT)
    private String district;

    /**
     * 乡
     */
    @XMLObject(xpath = "./RURAL", ntype = XMLObject.TEXT)
    private String rural;

    /**
     * 村
     */
    @XMLObject(xpath = "./VILLAGE", ntype = XMLObject.TEXT)
    private String village;

    /**
     * 门牌
     */
    @XMLObject(xpath = "./HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String houseNumber;

    /**
     * 职业类别代码
     */
    @XMLObject(xpath = "./OCCUPATION_ID", ntype = XMLObject.TEXT)
    private String occupationId;

    /**
     * 职业类别描述
     */
    @XMLObject(xpath = "./OCCUPATION_DEPICT", ntype = XMLObject.TEXT)
    private String occupationDepict;

    /**
     * 工作单位名称
     */
    @XMLObject(xpath = "./COMPANY", ntype = XMLObject.TEXT)
    private String company;

    /**
     * 健康卡发放机构代码
     */
    @XMLObject(xpath = "./HEALTH_CARD_ORGANIZATION_CODE", ntype = XMLObject.TEXT)
    private String healthCardOrganizationCode;

    /**
     * 城乡居民健康档案编号
     */
    @XMLObject(xpath = "./HEALTH_FILE_NUMBER", ntype = XMLObject.TEXT)
    private String healthFileNumber;

    /**
     * 建档医疗机构组织机构代码
     */
    @XMLObject(xpath = "./ARCHIVING_ORGANIZATION_CODE", ntype = XMLObject.TEXT)
    private String archivingOrganizationCode;

    /**
     * 联系人关系
     */
    @XMLObject(xpath = "./CONTACT_RELATIONSHIP_CODE", ntype = XMLObject.TEXT)
    private String contactRelationshipCode;

    /**
     * 登记机构代码
     */
    @XMLObject(xpath = "./PROVIDER_ORGANIZATION_ID", ntype = XMLObject.TEXT)
    private String providerOrganizationId;

    /**
     * 登记机构名称
     */
    @XMLObject(xpath = "./PROVIDER_ORGANIZATION_NAME", ntype = XMLObject.TEXT)
    private String providerOrganizationName;


    /**
     * 发送者ID
     */
    @XMLObject(xpath = "./SEND_ID", ntype = XMLObject.TEXT)
    private String sendId;

    /**
     * 状态代码
     */
    @XMLObject(xpath = "./STATUS_CODE", ntype = XMLObject.TEXT)
    private String statusCode;

    /**
     * 现住址省
     */
    @XMLObject(xpath = "./HOME_PROVINCE", ntype = XMLObject.TEXT)
    private String homeProvince;

    /**
     * 现住址市
     */
    @XMLObject(xpath = "./HOME_CITY", ntype = XMLObject.TEXT)
    private String homeCity;

    /**
     * 现住址县
     */
    @XMLObject(xpath = "./HOME_COUNTY", ntype = XMLObject.TEXT)
    private String homeCounty;

    /**
     * 现住址乡
     */
    @XMLObject(xpath = "./HOME_RURAL", ntype = XMLObject.TEXT)
    private String homeRural;

    /**
     * 现住址镇
     */
    @XMLObject(xpath = "./HOME_TOWNSHIP", ntype = XMLObject.TEXT)
    private String homeTownship;

    /**
     * 现住址区
     */
    @XMLObject(xpath = "./HOME_DISTRICT", ntype = XMLObject.TEXT)
    private String homeDistrict;

    /**
     * 现住址村
     */
    @XMLObject(xpath = "./HOME_VILLAGE", ntype = XMLObject.TEXT)
    private String homeVillage;

    /**
     * 现住址街道
     */
    @XMLObject(xpath = "./HOME_STREET_NAME", ntype = XMLObject.TEXT)
    private String homeStreetName;

    /**
     * 现住址门牌
     */
    @XMLObject(xpath = "./HOME_HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String homeHouseNumber;

    /**
     * 户口省
     */
    @XMLObject(xpath = "./REGISTER_PROVINCE", ntype = XMLObject.TEXT)
    private String registerProvince;

    /**
     * 户口市
     */
    @XMLObject(xpath = "./REGISTER_CITY", ntype = XMLObject.TEXT)
    private String registerCity;

    /**
     * 户口县
     */
    @XMLObject(xpath = "./REGISTER_COUNTY", ntype = XMLObject.TEXT)
    private String registerCounty;

    /**
     * 户口镇
     */
    @XMLObject(xpath = "./REGISTER_TOWNSHIP", ntype = XMLObject.TEXT)
    private String registerTownship;

    /**
     * 户口街道
     */
    @XMLObject(xpath = "./REGISTER_STREET_NAME", ntype = XMLObject.TEXT)
    private String registerStreetName;

    /**
     * 户口区
     */
    @XMLObject(xpath = "./REGISTER_DISTRICT", ntype = XMLObject.TEXT)
    private String registerDistrict;

    /**
     * 户口乡
     */
    @XMLObject(xpath = "./REGISTER_RURAL", ntype = XMLObject.TEXT)
    private String registerRural;

    /**
     * 户口村
     */
    @XMLObject(xpath = "./REGISTER_VILLAGE", ntype = XMLObject.TEXT)
    private String registerVillage;

    /**
     * 户口门牌
     */
    @XMLObject(xpath = "./REGISTER_HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String registerHouseNumber;

    /**
     * 籍贯省
     */
    @XMLObject(xpath = "./NATIVE_PROVINCE", ntype = XMLObject.TEXT)
    private String nativeProvince;

    /**
     * 籍贯市
     */
    @XMLObject(xpath = "./NATIVE_CITY", ntype = XMLObject.TEXT)
    private String nativeCity;

    /**
     * 工作邮编
     */
    @XMLObject(xpath = "./WORK_ZIP_CODE", ntype = XMLObject.TEXT)
    private String workZipCode;

    /**
     * 工作地址省
     */
    @XMLObject(xpath = "./WORK_PROVINCE", ntype = XMLObject.TEXT)
    private String workProvince;

    /**
     * 工作地址市
     */
    @XMLObject(xpath = "./WORK_CITY", ntype = XMLObject.TEXT)
    private String workCity;

    /**
     * 工作地址县
     */
    @XMLObject(xpath = "./WORK_COUNTY", ntype = XMLObject.TEXT)
    private String workCounty;

    /**
     * 工作地址乡
     */
    @XMLObject(xpath = "./WORK_RURAL", ntype = XMLObject.TEXT)
    private String workRural;

    /**
     * 工作地址镇
     */
    @XMLObject(xpath = "./WORK_TOWNSHIP", ntype = XMLObject.TEXT)
    private String workTownship;

    /**
     * 工作地址区
     */
    @XMLObject(xpath = "./WORK_DISTRICT", ntype = XMLObject.TEXT)
    private String workDistrict;

    /**
     * 工作地址村
     */
    @XMLObject(xpath = "./WORK_VILLAGE", ntype = XMLObject.TEXT)
    private String workVillage;

    /**
     * 工作地址街道
     */
    @XMLObject(xpath = "./WORK_STREET_NAME", ntype = XMLObject.TEXT)
    private String workStreetName;

    /**
     * 工作地址门牌
     */
    @XMLObject(xpath = "./WORK_HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String workHouseNumber;

    /**
     * 出生地省
     */
    @XMLObject(xpath = "./BIRTH_PROVINCE", ntype = XMLObject.TEXT)
    private String birthProvince;

    /**
     * 出生地市
     */
    @XMLObject(xpath = "./BIRTH_CITY", ntype = XMLObject.TEXT)
    private String birthCity;

    /**
     * 出生地县
     */
    @XMLObject(xpath = "./BIRTH_COUNTY", ntype = XMLObject.TEXT)
    private String birthCounty;

    /**
     * 出生地乡
     */
    @XMLObject(xpath = "./BIRTH_RURAL", ntype = XMLObject.TEXT)
    private String birthRural;

    /**
     * 出生地镇
     */
    @XMLObject(xpath = "./BIRTH_TOWNSHIP", ntype = XMLObject.TEXT)
    private String birthTownship;

    /**
     * 出生地区
     */
    @XMLObject(xpath = "./BIRTH_DISTRICT", ntype = XMLObject.TEXT)
    private String birthDistrict;

    /**
     * 出生地村
     */
    @XMLObject(xpath = "./BIRTH_VILLAGE", ntype = XMLObject.TEXT)
    private String birthVillage;

    /**
     * 出生地街道
     */
    @XMLObject(xpath = "./BIRTH_STREET_NAME", ntype = XMLObject.TEXT)
    private String birthStreetName;

    /**
     * 出生地门牌
     */
    @XMLObject(xpath = "./BIRTH_HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String birthHouseNumber;

    /**
     * 联系人村
     */
    @XMLObject(xpath = "./RELATION_VILLAGE", ntype = XMLObject.TEXT)
    private String relationVillage;

    /**
     * 联系人省
     */
    @XMLObject(xpath = "./RELATION_PROVINCE", ntype = XMLObject.TEXT)
    private String relationProvince;

    /**
     * 联系人门牌
     */
    @XMLObject(xpath = "./RELATION_HOUSE_NUMBER", ntype = XMLObject.TEXT)
    private String relationHouseNumber;

    /**
     * 联系人市
     */
    @XMLObject(xpath = "./RELATION_CITY", ntype = XMLObject.TEXT)
    private String relationCity;

    /**
     * 联系人县
     */
    @XMLObject(xpath = "./RELATION_COUNTY", ntype = XMLObject.TEXT)
    private String relationCounty;

    /**
     * 联系人乡
     */
    @XMLObject(xpath = "./RELATION_RURAL", ntype = XMLObject.TEXT)
    private String relationRural;

    /**
     * 年龄
     */
    @XMLObject(xpath = "./AGE", ntype = XMLObject.TEXT)
    private String age;

    /**
     * 年龄单位
     */
    @XMLObject(xpath = "./AGE_UNIT", ntype = XMLObject.TEXT)
    private String ageUnit;

    /**
     * 年龄单位
     */
    @XMLObject(xpath = "./PHONE_NUMBER", ntype = XMLObject.TEXT)
    private String phoneNumber;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientDomainId() {
        return patientDomainId;
    }

    public void setPatientDomainId(String patientDomainId) {
        this.patientDomainId = patientDomainId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getNameSpell() {
        return nameSpell;
    }

    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getHomePlace() {
        return homePlace;
    }

    public void setHomePlace(String homePlace) {
        this.homePlace = homePlace;
    }

    public String getRegisteredPlace() {
        return registeredPlace;
    }

    public void setRegisteredPlace(String registeredPlace) {
        this.registeredPlace = registeredPlace;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber;
    }

    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public void setCitizenCardNumber(String citizenCardNumber) {
        this.citizenCardNumber = citizenCardNumber;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEthnicCode() {
        return ethnicCode;
    }

    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMedicalInsuranceNumber() {
        return medicalInsuranceNumber;
    }

    public void setMedicalInsuranceNumber(String medicalInsuranceNumber) {
        this.medicalInsuranceNumber = medicalInsuranceNumber;
    }

    public String getElderCertificateNumber() {
        return elderCertificateNumber;
    }

    public void setElderCertificateNumber(String elderCertificateNumber) {
        this.elderCertificateNumber = elderCertificateNumber;
    }

    public String getMedicalRecordsNumber() {
        return medicalRecordsNumber;
    }

    public void setMedicalRecordsNumber(String medicalRecordsNumber) {
        this.medicalRecordsNumber = medicalRecordsNumber;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalCode() {
        return maritalCode;
    }

    public void setMaritalCode(String maritalCode) {
        this.maritalCode = maritalCode;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getHomeZipCode() {
        return homeZipCode;
    }

    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode;
    }

    public String getRegisteredZipCode() {
        return registeredZipCode;
    }

    public void setRegisteredZipCode(String registeredZipCode) {
        this.registeredZipCode = registeredZipCode;
    }

    public String getBirthZipCode() {
        return birthZipCode;
    }

    public void setBirthZipCode(String birthZipCode) {
        this.birthZipCode = birthZipCode;
    }

    public String getNativeZipCode() {
        return nativeZipCode;
    }

    public void setNativeZipCode(String nativeZipCode) {
        this.nativeZipCode = nativeZipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getRelationAddress() {
        return relationAddress;
    }

    public void setRelationAddress(String relationAddress) {
        this.relationAddress = relationAddress;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone;
    }

    public String getRelationZipCode() {
        return relationZipCode;
    }

    public void setRelationZipCode(String relationZipCode) {
        this.relationZipCode = relationZipCode;
    }

    public String getBloodTypeCode() {
        return bloodTypeCode;
    }

    public void setBloodTypeCode(String bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getCertificatesTypeCode() {
        return certificatesTypeCode;
    }

    public void setCertificatesTypeCode(String certificatesTypeCode) {
        this.certificatesTypeCode = certificatesTypeCode;
    }

    public String getCertificatesNumber() {
        return certificatesNumber;
    }

    public void setCertificatesNumber(String certificatesNumber) {
        this.certificatesNumber = certificatesNumber;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getAllergyInformation() {
        return allergyInformation;
    }

    public void setAllergyInformation(String allergyInformation) {
        this.allergyInformation = allergyInformation;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime;
    }

    public String getDeathInd() {
        return deathInd;
    }

    public void setDeathInd(String deathInd) {
        this.deathInd = deathInd;
    }

    public String getInsuranceTypeCode() {
        return insuranceTypeCode;
    }

    public void setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getCertificatesTypeDepict() {
        return certificatesTypeDepict;
    }

    public void setCertificatesTypeDepict(String certificatesTypeDepict) {
        this.certificatesTypeDepict = certificatesTypeDepict;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRural() {
        return rural;
    }

    public void setRural(String rural) {
        this.rural = rural;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId;
    }

    public String getOccupationDepict() {
        return occupationDepict;
    }

    public void setOccupationDepict(String occupationDepict) {
        this.occupationDepict = occupationDepict;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHealthCardOrganizationCode() {
        return healthCardOrganizationCode;
    }

    public void setHealthCardOrganizationCode(String healthCardOrganizationCode) {
        this.healthCardOrganizationCode = healthCardOrganizationCode;
    }

    public String getHealthFileNumber() {
        return healthFileNumber;
    }

    public void setHealthFileNumber(String healthFileNumber) {
        this.healthFileNumber = healthFileNumber;
    }

    public String getArchivingOrganizationCode() {
        return archivingOrganizationCode;
    }

    public void setArchivingOrganizationCode(String archivingOrganizationCode) {
        this.archivingOrganizationCode = archivingOrganizationCode;
    }

    public String getContactRelationshipCode() {
        return contactRelationshipCode;
    }

    public void setContactRelationshipCode(String contactRelationshipCode) {
        this.contactRelationshipCode = contactRelationshipCode;
    }

    public String getProviderOrganizationId() {
        return providerOrganizationId;
    }

    public void setProviderOrganizationId(String providerOrganizationId) {
        this.providerOrganizationId = providerOrganizationId;
    }

    public String getProviderOrganizationName() {
        return providerOrganizationName;
    }

    public void setProviderOrganizationName(String providerOrganizationName) {
        this.providerOrganizationName = providerOrganizationName;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeCounty() {
        return homeCounty;
    }

    public void setHomeCounty(String homeCounty) {
        this.homeCounty = homeCounty;
    }

    public String getHomeRural() {
        return homeRural;
    }

    public void setHomeRural(String homeRural) {
        this.homeRural = homeRural;
    }

    public String getHomeTownship() {
        return homeTownship;
    }

    public void setHomeTownship(String homeTownship) {
        this.homeTownship = homeTownship;
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict;
    }

    public String getHomeVillage() {
        return homeVillage;
    }

    public void setHomeVillage(String homeVillage) {
        this.homeVillage = homeVillage;
    }

    public String getHomeStreetName() {
        return homeStreetName;
    }

    public void setHomeStreetName(String homeStreetName) {
        this.homeStreetName = homeStreetName;
    }

    public String getHomeHouseNumber() {
        return homeHouseNumber;
    }

    public void setHomeHouseNumber(String homeHouseNumber) {
        this.homeHouseNumber = homeHouseNumber;
    }

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince;
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity;
    }

    public String getRegisterCounty() {
        return registerCounty;
    }

    public void setRegisterCounty(String registerCounty) {
        this.registerCounty = registerCounty;
    }

    public String getRegisterTownship() {
        return registerTownship;
    }

    public void setRegisterTownship(String registerTownship) {
        this.registerTownship = registerTownship;
    }

    public String getRegisterStreetName() {
        return registerStreetName;
    }

    public void setRegisterStreetName(String registerStreetName) {
        this.registerStreetName = registerStreetName;
    }

    public String getRegisterDistrict() {
        return registerDistrict;
    }

    public void setRegisterDistrict(String registerDistrict) {
        this.registerDistrict = registerDistrict;
    }

    public String getRegisterRural() {
        return registerRural;
    }

    public void setRegisterRural(String registerRural) {
        this.registerRural = registerRural;
    }

    public String getRegisterVillage() {
        return registerVillage;
    }

    public void setRegisterVillage(String registerVillage) {
        this.registerVillage = registerVillage;
    }

    public String getRegisterHouseNumber() {
        return registerHouseNumber;
    }

    public void setRegisterHouseNumber(String registerHouseNumber) {
        this.registerHouseNumber = registerHouseNumber;
    }

    public String getNativeProvince() {
        return nativeProvince;
    }

    public void setNativeProvince(String nativeProvince) {
        this.nativeProvince = nativeProvince;
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity;
    }

    public String getWorkZipCode() {
        return workZipCode;
    }

    public void setWorkZipCode(String workZipCode) {
        this.workZipCode = workZipCode;
    }

    public String getWorkProvince() {
        return workProvince;
    }

    public void setWorkProvince(String workProvince) {
        this.workProvince = workProvince;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getWorkCounty() {
        return workCounty;
    }

    public void setWorkCounty(String workCounty) {
        this.workCounty = workCounty;
    }

    public String getWorkRural() {
        return workRural;
    }

    public void setWorkRural(String workRural) {
        this.workRural = workRural;
    }

    public String getWorkTownship() {
        return workTownship;
    }

    public void setWorkTownship(String workTownship) {
        this.workTownship = workTownship;
    }

    public String getWorkDistrict() {
        return workDistrict;
    }

    public void setWorkDistrict(String workDistrict) {
        this.workDistrict = workDistrict;
    }

    public String getWorkVillage() {
        return workVillage;
    }

    public void setWorkVillage(String workVillage) {
        this.workVillage = workVillage;
    }

    public String getWorkStreetName() {
        return workStreetName;
    }

    public void setWorkStreetName(String workStreetName) {
        this.workStreetName = workStreetName;
    }

    public String getWorkHouseNumber() {
        return workHouseNumber;
    }

    public void setWorkHouseNumber(String workHouseNumber) {
        this.workHouseNumber = workHouseNumber;
    }

    public String getBirthProvince() {
        return birthProvince;
    }

    public void setBirthProvince(String birthProvince) {
        this.birthProvince = birthProvince;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthCounty() {
        return birthCounty;
    }

    public void setBirthCounty(String birthCounty) {
        this.birthCounty = birthCounty;
    }

    public String getBirthRural() {
        return birthRural;
    }

    public void setBirthRural(String birthRural) {
        this.birthRural = birthRural;
    }

    public String getBirthTownship() {
        return birthTownship;
    }

    public void setBirthTownship(String birthTownship) {
        this.birthTownship = birthTownship;
    }

    public String getBirthDistrict() {
        return birthDistrict;
    }

    public void setBirthDistrict(String birthDistrict) {
        this.birthDistrict = birthDistrict;
    }

    public String getBirthVillage() {
        return birthVillage;
    }

    public void setBirthVillage(String birthVillage) {
        this.birthVillage = birthVillage;
    }

    public String getBirthStreetName() {
        return birthStreetName;
    }

    public void setBirthStreetName(String birthStreetName) {
        this.birthStreetName = birthStreetName;
    }

    public String getBirthHouseNumber() {
        return birthHouseNumber;
    }

    public void setBirthHouseNumber(String birthHouseNumber) {
        this.birthHouseNumber = birthHouseNumber;
    }

    public String getRelationVillage() {
        return relationVillage;
    }

    public void setRelationVillage(String relationVillage) {
        this.relationVillage = relationVillage;
    }

    public String getRelationProvince() {
        return relationProvince;
    }

    public void setRelationProvince(String relationProvince) {
        this.relationProvince = relationProvince;
    }

    public String getRelationHouseNumber() {
        return relationHouseNumber;
    }

    public void setRelationHouseNumber(String relationHouseNumber) {
        this.relationHouseNumber = relationHouseNumber;
    }

    public String getRelationCity() {
        return relationCity;
    }

    public void setRelationCity(String relationCity) {
        this.relationCity = relationCity;
    }

    public String getRelationCounty() {
        return relationCounty;
    }

    public void setRelationCounty(String relationCounty) {
        this.relationCounty = relationCounty;
    }

    public String getRelationRural() {
        return relationRural;
    }

    public void setRelationRural(String relationRural) {
        this.relationRural = relationRural;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
