package com.dj.boot.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Integer userId;

    private String userName;

    private String userPwd;

    private Integer kcId;
}
