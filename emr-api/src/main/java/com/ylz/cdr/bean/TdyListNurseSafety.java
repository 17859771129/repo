package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_NURSE_SAFETY")
public class TdyListNurseSafety implements Serializable {

    private static final long serialVersionUID = 4284267665315225080L;
    private Integer pk;

    private String docUnique;

    private String docDomainId;

    private String docVersion;

    private String docType;

    private String empi;

    private String encounterId;

    private String code;

    private String name;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getDocUnique() {
        return docUnique;
    }

    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    public String getDocDomainId() {
        return docDomainId;
    }

    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    public String getDocVersion() {
        return docVersion;
    }

    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
