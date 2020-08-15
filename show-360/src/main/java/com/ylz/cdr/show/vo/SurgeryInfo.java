package com.ylz.cdr.show.vo;

import com.ylz.cdr.bean.Hdsd000606;

public class SurgeryInfo extends Hdsd000606 {
    private String diagCodeBefore;
    private String diagNameBefore;
    private String diagCodeAfter;
    private String diagNameAfter;

    public String getDiagCodeBefore() {
        return diagCodeBefore;
    }

    public void setDiagCodeBefore(String diagCodeBefore) {
        this.diagCodeBefore = diagCodeBefore;
    }

    public String getDiagNameBefore() {
        return diagNameBefore;
    }

    public void setDiagNameBefore(String diagNameBefore) {
        this.diagNameBefore = diagNameBefore;
    }

    public String getDiagCodeAfter() {
        return diagCodeAfter;
    }

    public void setDiagCodeAfter(String diagCodeAfter) {
        this.diagCodeAfter = diagCodeAfter;
    }

    public String getDiagNameAfter() {
        return diagNameAfter;
    }

    public void setDiagNameAfter(String diagNameAfter) {
        this.diagNameAfter = diagNameAfter;
    }
}
