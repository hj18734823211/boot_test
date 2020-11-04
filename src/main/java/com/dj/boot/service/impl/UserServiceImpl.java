package com.dj.boot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dj.boot.dto.UserDTO;
import com.dj.boot.entity.UserEntity;
import com.dj.boot.mapper.UserMapper;
import com.dj.boot.model.BusinessException;
import com.dj.boot.model.DozerUtil;
import com.dj.boot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Override
    public List<UserDTO> findUserByKcId(Integer kcId) throws BusinessException {
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("kc_id", kcId);
        List<UserEntity> userEntityList = this.list(queryWrapper);
        return DozerUtil.mapList(userEntityList, UserDTO.class);
    }
}
