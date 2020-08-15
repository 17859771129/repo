package com.ylz.manager.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("domain_doc")
public class DomainDoc implements Serializable {
    private static final long serialVersionUID = 613613034957147665L;

    private String domainId;

    private String docCode;
}
