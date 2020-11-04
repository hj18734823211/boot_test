package com.dj.boot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

;

@Data
@Builder
@AllArgsConstructor // 全部参数的构造器
@NoArgsConstructor // 无参构造器
public class PageResult {

    /**
     * 总页数
     */
    private Long pages = 1l;


    /**
     * 分页数据
     */
    private List<?> records;

    /**
     * 当前页
     */
    private Long current = 1l;


}
