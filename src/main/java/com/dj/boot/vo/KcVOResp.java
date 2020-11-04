package com.dj.boot.vo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class KcVOResp {

    private Integer kcId;

    private String kcName;

    private Integer kcNum;

    private Date startTime;

    private Date endTime;

    private Integer kcStatus;

    public String getKcStatus() {
        if(new Date().before(startTime)) {
            return "未开考";
        }
        if(new Date().after(startTime) && new Date().before(endTime)) {
            return "进行中";
        }
        return "已结束";





















































    }
}
