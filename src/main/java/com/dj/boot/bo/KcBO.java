package com.dj.boot.bo;

import lombok.Data;

import java.util.Date;

@Data
public class KcBO {

    private Integer kcId;

    private String kcName;

    private Integer kcNum;

    private Date startTime;

    private Date endTime;

    private Integer kcStatus;
}
