package com.ylz.common.tool;

public class PageParam {

    private int from;
    private int size;

    public PageParam() {
        this.from = 0;
        this.size = 10;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
