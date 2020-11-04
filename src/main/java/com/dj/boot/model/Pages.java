package com.dj.boot.model;

import lombok.Data;

@Data
public class Pages {

    /**
     * 当前页
     */
    private Long pageNo = 1l;

    /**
     * 页数
     */
    private Long pageSize = 2l;
}
