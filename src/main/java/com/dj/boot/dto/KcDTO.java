package com.dj.boot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class KcDTO {

    private Integer kcId;

    private String kcName;

    private Integer kcNum;

    private Date startTime;

    private Date endTime;

    private Integer kcStatus;
}
