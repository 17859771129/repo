package com.ylz.person.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("patient_info")
public class PatientInfo implements Serializable {
    private static final long serialVersionUID = -7835955583144985178L;

    private String globalId;

    private String patientId;

    private String patientDomainId;

    private String patientName;

    private String nameSpell;

    private String dateOfBirth;

    private String identityNo;

    private String homePlace;

    private String registeredPlace;

    private String nativePlace;

    private String birthPlace;

    private String socialSecurityNumber;

    private String healthCardNumber;

    private String citizenCardNumber;

    private String sexCode;

    private String sex;

    private String ethnicCode;

    private String ethnic;

    private String countryCode;

    private String country;

    private String medicalInsuranceNumber;

    private String elderCertificateNumber;

    private String medicalRecordsNumber;

    private String languageCode;

    private String language;

    private String religionCode;

    private String religion;

    private String maritalCode;

    private String marital;

    private String degreeCode;

    private String degree;

    private String homePhone;

    private String homeZipCode;

    private String registeredZipCode;

    private String birthZipCode;

    private String nativeZipCode;

    private String email;

    private String identity;

    private String identityCode;

    private String workAddress;

    private String workPhone;

    private String relationAddress;

    private String relationName;

    private String contactRelationshipCode;

    private String relationPhone;

    private String relationZipCode;

    private String bloodTypeCode;

    private String bloodType;

    private String certificatesTypeCode;

    private String certificatesNumber;

    private String chargeType;

    private String allergyInformation;

    private String insuranceType;

    private String deathTime;

    private String deathInd;

    private String insuranceTypeCode;

    private String effectiveTime;

    private String certificatesTypeDepict;

    private String occupationId;

    private String occupationDepict;

    private String company;

    private String healthCardOrganizationCode;

    private String healthFileNumber;

    private String archivingOrganizationCode;

    private String providerOrganizationId;

    private String providerOrganizationName;

    private String statusCode;

    private String homeProvince;

    private String homeCity;

    private String homeCounty;

    private String homeRural;

    private String homeTownship;

    private String homeDistrict;

    private String homeVillage;

    private String homeStreetName;

    private String homeHouseNumber;

    private String registerProvince;

    private String registerCity;

    private String registerCounty;

    private String registerTownship;

    private String registerStreetName;

    private String registerDistrict;

    private String registerRural;

    private String registerVillage;

    private String registerHouseNumber;

    private String nativeProvince;

    private String nativeCity;

    private String workZipCode;

    private String workProvince;

    private String workCity;

    private String workCounty;

    private String workRural;

    private String workTownship;

    private String workDistrict;

    private String workVillage;

    private String workStreetName;

    private String workHouseNumber;

    private String birthProvince;

    private String birthCity;

    private String birthCounty;

    private String birthRural;

    private String birthTownship;

    private String birthDistrict;

    private String birthVillage;

    private String birthStreetName;

    private String birthHouseNumber;

    private String relationVillage;

    private String relationProvince;

    private String relationHouseNumber;

    private String relationCity;

    private String relationCounty;

    private String relationRural;

    private String age;

    private String ageUnit;

    private String telephone;

    private String province;

    private String city;

    private String district;

    private String rural;

    private String village;

    private String housenumber;

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId == null ? null : globalId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientDomainId() {
        return patientDomainId;
    }

    public void setPatientDomainId(String patientDomainId) {
        this.patientDomainId = patientDomainId == null ? null : patientDomainId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getNameSpell() {
        return nameSpell;
    }

    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell == null ? null : nameSpell.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getHomePlace() {
        return homePlace;
    }

    public void setHomePlace(String homePlace) {
        this.homePlace = homePlace == null ? null : homePlace.trim();
    }

    public String getRegisteredPlace() {
        return registeredPlace;
    }

    public void setRegisteredPlace(String registeredPlace) {
        this.registeredPlace = registeredPlace == null ? null : registeredPlace.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace == null ? null : birthPlace.trim();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber == null ? null : socialSecurityNumber.trim();
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber == null ? null : healthCardNumber.trim();
    }

    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public void setCitizenCardNumber(String citizenCardNumber) {
        this.citizenCardNumber = citizenCardNumber == null ? null : citizenCardNumber.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEthnicCode() {
        return ethnicCode;
    }

    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode == null ? null : ethnicCode.trim();
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getMedicalInsuranceNumber() {
        return medicalInsuranceNumber;
    }

    public void setMedicalInsuranceNumber(String medicalInsuranceNumber) {
        this.medicalInsuranceNumber = medicalInsuranceNumber == null ? null : medicalInsuranceNumber.trim();
    }

    public String getElderCertificateNumber() {
        return elderCertificateNumber;
    }

    public void setElderCertificateNumber(String elderCertificateNumber) {
        this.elderCertificateNumber = elderCertificateNumber == null ? null : elderCertificateNumber.trim();
    }

    public String getMedicalRecordsNumber() {
        return medicalRecordsNumber;
    }

    public void setMedicalRecordsNumber(String medicalRecordsNumber) {
        this.medicalRecordsNumber = medicalRecordsNumber == null ? null : medicalRecordsNumber.trim();
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode == null ? null : languageCode.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getReligionCode() {
        return religionCode;
    }

    public void setReligionCode(String religionCode) {
        this.religionCode = religionCode == null ? null : religionCode.trim();
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion == null ? null : religion.trim();
    }

    public String getMaritalCode() {
        return maritalCode;
    }

    public void setMaritalCode(String maritalCode) {
        this.maritalCode = maritalCode == null ? null : maritalCode.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode == null ? null : degreeCode.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone == null ? null : homePhone.trim();
    }

    public String getHomeZipCode() {
        return homeZipCode;
    }

    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode == null ? null : homeZipCode.trim();
    }

    public String getRegisteredZipCode() {
        return registeredZipCode;
    }

    public void setRegisteredZipCode(String registeredZipCode) {
        this.registeredZipCode = registeredZipCode == null ? null : registeredZipCode.trim();
    }

    public String getBirthZipCode() {
        return birthZipCode;
    }

    public void setBirthZipCode(String birthZipCode) {
        this.birthZipCode = birthZipCode == null ? null : birthZipCode.trim();
    }

    public String getNativeZipCode() {
        return nativeZipCode;
    }

    public void setNativeZipCode(String nativeZipCode) {
        this.nativeZipCode = nativeZipCode == null ? null : nativeZipCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone == null ? null : workPhone.trim();
    }

    public String getRelationAddress() {
        return relationAddress;
    }

    public void setRelationAddress(String relationAddress) {
        this.relationAddress = relationAddress == null ? null : relationAddress.trim();
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public String getContactRelationshipCode() {
        return contactRelationshipCode;
    }

    public void setContactRelationshipCode(String contactRelationshipCode) {
        this.contactRelationshipCode = contactRelationshipCode == null ? null : contactRelationshipCode.trim();
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone == null ? null : relationPhone.trim();
    }

    public String getRelationZipCode() {
        return relationZipCode;
    }

    public void setRelationZipCode(String relationZipCode) {
        this.relationZipCode = relationZipCode == null ? null : relationZipCode.trim();
    }

    public String getBloodTypeCode() {
        return bloodTypeCode;
    }

    public void setBloodTypeCode(String bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode == null ? null : bloodTypeCode.trim();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType == null ? null : bloodType.trim();
    }

    public String getCertificatesTypeCode() {
        return certificatesTypeCode;
    }

    public void setCertificatesTypeCode(String certificatesTypeCode) {
        this.certificatesTypeCode = certificatesTypeCode == null ? null : certificatesTypeCode.trim();
    }

    public String getCertificatesNumber() {
        return certificatesNumber;
    }

    public void setCertificatesNumber(String certificatesNumber) {
        this.certificatesNumber = certificatesNumber == null ? null : certificatesNumber.trim();
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    public String getAllergyInformation() {
        return allergyInformation;
    }

    public void setAllergyInformation(String allergyInformation) {
        this.allergyInformation = allergyInformation == null ? null : allergyInformation.trim();
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public String getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime == null ? null : deathTime.trim();
    }

    public String getDeathInd() {
        return deathInd;
    }

    public void setDeathInd(String deathInd) {
        this.deathInd = deathInd == null ? null : deathInd.trim();
    }

    public String getInsuranceTypeCode() {
        return insuranceTypeCode;
    }

    public void setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode == null ? null : insuranceTypeCode.trim();
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime == null ? null : effectiveTime.trim();
    }

    public String getCertificatesTypeDepict() {
        return certificatesTypeDepict;
    }

    public void setCertificatesTypeDepict(String certificatesTypeDepict) {
        this.certificatesTypeDepict = certificatesTypeDepict == null ? null : certificatesTypeDepict.trim();
    }

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId == null ? null : occupationId.trim();
    }

    public String getOccupationDepict() {
        return occupationDepict;
    }

    public void setOccupationDepict(String occupationDepict) {
        this.occupationDepict = occupationDepict == null ? null : occupationDepict.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getHealthCardOrganizationCode() {
        return healthCardOrganizationCode;
    }

    public void setHealthCardOrganizationCode(String healthCardOrganizationCode) {
        this.healthCardOrganizationCode = healthCardOrganizationCode == null ? null : healthCardOrganizationCode.trim();
    }

    public String getHealthFileNumber() {
        return healthFileNumber;
    }

    public void setHealthFileNumber(String healthFileNumber) {
        this.healthFileNumber = healthFileNumber == null ? null : healthFileNumber.trim();
    }

    public String getArchivingOrganizationCode() {
        return archivingOrganizationCode;
    }

    public void setArchivingOrganizationCode(String archivingOrganizationCode) {
        this.archivingOrganizationCode = archivingOrganizationCode == null ? null : archivingOrganizationCode.trim();
    }

    public String getProviderOrganizationId() {
        return providerOrganizationId;
    }

    public void setProviderOrganizationId(String providerOrganizationId) {
        this.providerOrganizationId = providerOrganizationId == null ? null : providerOrganizationId.trim();
    }

    public String getProviderOrganizationName() {
        return providerOrganizationName;
    }

    public void setProviderOrganizationName(String providerOrganizationName) {
        this.providerOrganizationName = providerOrganizationName == null ? null : providerOrganizationName.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince == null ? null : homeProvince.trim();
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity == null ? null : homeCity.trim();
    }

    public String getHomeCounty() {
        return homeCounty;
    }

    public void setHomeCounty(String homeCounty) {
        this.homeCounty = homeCounty == null ? null : homeCounty.trim();
    }

    public String getHomeRural() {
        return homeRural;
    }

    public void setHomeRural(String homeRural) {
        this.homeRural = homeRural == null ? null : homeRural.trim();
    }

    public String getHomeTownship() {
        return homeTownship;
    }

    public void setHomeTownship(String homeTownship) {
        this.homeTownship = homeTownship == null ? null : homeTownship.trim();
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict == null ? null : homeDistrict.trim();
    }

    public String getHomeVillage() {
        return homeVillage;
    }

    public void setHomeVillage(String homeVillage) {
        this.homeVillage = homeVillage == null ? null : homeVillage.trim();
    }

    public String getHomeStreetName() {
        return homeStreetName;
    }

    public void setHomeStreetName(String homeStreetName) {
        this.homeStreetName = homeStreetName == null ? null : homeStreetName.trim();
    }

    public String getHomeHouseNumber() {
        return homeHouseNumber;
    }

    public void setHomeHouseNumber(String homeHouseNumber) {
        this.homeHouseNumber = homeHouseNumber == null ? null : homeHouseNumber.trim();
    }

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince == null ? null : registerProvince.trim();
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity == null ? null : registerCity.trim();
    }

    public String getRegisterCounty() {
        return registerCounty;
    }

    public void setRegisterCounty(String registerCounty) {
        this.registerCounty = registerCounty == null ? null : registerCounty.trim();
    }

    public String getRegisterTownship() {
        return registerTownship;
    }

    public void setRegisterTownship(String registerTownship) {
        this.registerTownship = registerTownship == null ? null : registerTownship.trim();
    }

    public String getRegisterStreetName() {
        return registerStreetName;
    }

    public void setRegisterStreetName(String registerStreetName) {
        this.registerStreetName = registerStreetName == null ? null : registerStreetName.trim();
    }

    public String getRegisterDistrict() {
        return registerDistrict;
    }

    public void setRegisterDistrict(String registerDistrict) {
        this.registerDistrict = registerDistrict == null ? null : registerDistrict.trim();
    }

    public String getRegisterRural() {
        return registerRural;
    }

    public void setRegisterRural(String registerRural) {
        this.registerRural = registerRural == null ? null : registerRural.trim();
    }

    public String getRegisterVillage() {
        return registerVillage;
    }

    public void setRegisterVillage(String registerVillage) {
        this.registerVillage = registerVillage == null ? null : registerVillage.trim();
    }

    public String getRegisterHouseNumber() {
        return registerHouseNumber;
    }

    public void setRegisterHouseNumber(String registerHouseNumber) {
        this.registerHouseNumber = registerHouseNumber == null ? null : registerHouseNumber.trim();
    }

    public String getNativeProvince() {
        return nativeProvince;
    }

    public void setNativeProvince(String nativeProvince) {
        this.nativeProvince = nativeProvince == null ? null : nativeProvince.trim();
    }

    public String getNativeCity() {
        return nativeCity;
    }

    public void setNativeCity(String nativeCity) {
        this.nativeCity = nativeCity == null ? null : nativeCity.trim();
    }

    public String getWorkZipCode() {
        return workZipCode;
    }

    public void setWorkZipCode(String workZipCode) {
        this.workZipCode = workZipCode == null ? null : workZipCode.trim();
    }

    public String getWorkProvince() {
        return workProvince;
    }

    public void setWorkProvince(String workProvince) {
        this.workProvince = workProvince == null ? null : workProvince.trim();
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity == null ? null : workCity.trim();
    }

    public String getWorkCounty() {
        return workCounty;
    }

    public void setWorkCounty(String workCounty) {
        this.workCounty = workCounty == null ? null : workCounty.trim();
    }

    public String getWorkRural() {
        return workRural;
    }

    public void setWorkRural(String workRural) {
        this.workRural = workRural == null ? null : workRural.trim();
    }

    public String getWorkTownship() {
        return workTownship;
    }

    public void setWorkTownship(String workTownship) {
        this.workTownship = workTownship == null ? null : workTownship.trim();
    }

    public String getWorkDistrict() {
        return workDistrict;
    }

    public void setWorkDistrict(String workDistrict) {
        this.workDistrict = workDistrict == null ? null : workDistrict.trim();
    }

    public String getWorkVillage() {
        return workVillage;
    }

    public void setWorkVillage(String workVillage) {
        this.workVillage = workVillage == null ? null : workVillage.trim();
    }

    public String getWorkStreetName() {
        return workStreetName;
    }

    public void setWorkStreetName(String workStreetName) {
        this.workStreetName = workStreetName == null ? null : workStreetName.trim();
    }

    public String getWorkHouseNumber() {
        return workHouseNumber;
    }

    public void setWorkHouseNumber(String workHouseNumber) {
        this.workHouseNumber = workHouseNumber == null ? null : workHouseNumber.trim();
    }

    public String getBirthProvince() {
        return birthProvince;
    }

    public void setBirthProvince(String birthProvince) {
        this.birthProvince = birthProvince == null ? null : birthProvince.trim();
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity == null ? null : birthCity.trim();
    }

    public String getBirthCounty() {
        return birthCounty;
    }

    public void setBirthCounty(String birthCounty) {
        this.birthCounty = birthCounty == null ? null : birthCounty.trim();
    }

    public String getBirthRural() {
        return birthRural;
    }

    public void setBirthRural(String birthRural) {
        this.birthRural = birthRural == null ? null : birthRural.trim();
    }

    public String getBirthTownship() {
        return birthTownship;
    }

    public void setBirthTownship(String birthTownship) {
        this.birthTownship = birthTownship == null ? null : birthTownship.trim();
    }

    public String getBirthDistrict() {
        return birthDistrict;
    }

    public void setBirthDistrict(String birthDistrict) {
        this.birthDistrict = birthDistrict == null ? null : birthDistrict.trim();
    }

    public String getBirthVillage() {
        return birthVillage;
    }

    public void setBirthVillage(String birthVillage) {
        this.birthVillage = birthVillage == null ? null : birthVillage.trim();
    }

    public String getBirthStreetName() {
        return birthStreetName;
    }

    public void setBirthStreetName(String birthStreetName) {
        this.birthStreetName = birthStreetName == null ? null : birthStreetName.trim();
    }

    public String getBirthHouseNumber() {
        return birthHouseNumber;
    }

    public void setBirthHouseNumber(String birthHouseNumber) {
        this.birthHouseNumber = birthHouseNumber == null ? null : birthHouseNumber.trim();
    }

    public String getRelationVillage() {
        return relationVillage;
    }

    public void setRelationVillage(String relationVillage) {
        this.relationVillage = relationVillage == null ? null : relationVillage.trim();
    }

    public String getRelationProvince() {
        return relationProvince;
    }

    public void setRelationProvince(String relationProvince) {
        this.relationProvince = relationProvince == null ? null : relationProvince.trim();
    }

    public String getRelationHouseNumber() {
        return relationHouseNumber;
    }

    public void setRelationHouseNumber(String relationHouseNumber) {
        this.relationHouseNumber = relationHouseNumber == null ? null : relationHouseNumber.trim();
    }

    public String getRelationCity() {
        return relationCity;
    }

    public void setRelationCity(String relationCity) {
        this.relationCity = relationCity == null ? null : relationCity.trim();
    }

    public String getRelationCounty() {
        return relationCounty;
    }

    public void setRelationCounty(String relationCounty) {
        this.relationCounty = relationCounty == null ? null : relationCounty.trim();
    }

    public String getRelationRural() {
        return relationRural;
    }

    public void setRelationRural(String relationRural) {
        this.relationRural = relationRural == null ? null : relationRural.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getRural() {
        return rural;
    }

    public void setRural(String rural) {
        this.rural = rural == null ? null : rural.trim();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber == null ? null : housenumber.trim();
    }
}