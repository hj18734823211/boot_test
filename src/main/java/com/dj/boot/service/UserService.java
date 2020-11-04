package com.dj.boot.service;

import com.dj.boot.dto.UserDTO;
import com.dj.boot.model.BusinessException;

import java.util.List;

public interface UserService {
    List<UserDTO> findUserByKcId(Integer kcId) throws BusinessException;
}
