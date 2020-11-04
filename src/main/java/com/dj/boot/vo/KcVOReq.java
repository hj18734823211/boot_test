package com.dj.boot.vo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class KcVOReq {

    private Integer kcId;

    private String kcName;

    private Integer kcNum;

    private Date startTime;

    private Date endTime;

    private Integer kcStatus;
}
