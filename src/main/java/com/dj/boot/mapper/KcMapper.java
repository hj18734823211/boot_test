package com.dj.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dj.boot.bo.KcBO;
import com.dj.boot.entity.KcEntity;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface KcMapper extends BaseMapper<KcEntity> {

    List<KcBO> findAll() throws DataAccessException;
}
