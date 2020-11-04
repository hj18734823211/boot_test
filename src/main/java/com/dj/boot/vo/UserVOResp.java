package com.dj.boot.vo;

import lombok.Data;

@Data
public class UserVOResp {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer kcId;
}
