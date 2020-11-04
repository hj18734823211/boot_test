package com.dj.boot.service;

import com.dj.boot.dto.KcDTO;
import com.dj.boot.model.BusinessException;

import java.util.List;

public interface KcService {
    List<KcDTO> findAll() throws BusinessException;
}
