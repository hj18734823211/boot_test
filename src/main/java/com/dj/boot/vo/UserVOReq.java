package com.dj.boot.vo;

import lombok.Data;

@Data
public class UserVOReq {

    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer kcId;
}
