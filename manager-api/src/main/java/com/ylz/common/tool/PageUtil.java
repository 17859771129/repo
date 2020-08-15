package com.ylz.common.tool;

public class PageUtil {

    public static boolean setFromAndTo(int page, int size, int total, PageParam pageParam) {
        int from = (page - 1) * size;
        if ((from >= total) && (total != 0)) {
            return false;
        }
        pageParam.setFrom(from);
        pageParam.setSize(size);
        return true;
    }
}
