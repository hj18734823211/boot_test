package com.dj.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@TableName("kc")
public class KcEntity {

    @TableId(type = IdType.AUTO)
    @Mapping("kcId")
    private Integer id;

    private String kcName;

    private Date startTime;

    private Date endTime;

}
