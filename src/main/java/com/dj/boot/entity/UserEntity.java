package com.dj.boot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

@Data
@TableName("user")
public class UserEntity {

    @TableId(type = IdType.AUTO)
    @Mapping("userId")
    private Integer id;

    private String userName;

    private String userPwd;

    private Integer kcId;
}
