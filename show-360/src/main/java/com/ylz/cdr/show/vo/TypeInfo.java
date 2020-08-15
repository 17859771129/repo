package com.ylz.cdr.show.vo;

public class TypeInfo {

    private String typeCode;
    private String typeName;
    private int total;

    public TypeInfo() {
    }

    public TypeInfo(String typeCode, String typeName, int total) {
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.total = total;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
