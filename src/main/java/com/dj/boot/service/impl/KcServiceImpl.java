package com.dj.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dj.boot.bo.KcBO;
import com.dj.boot.dto.KcDTO;
import com.dj.boot.entity.KcEntity;
import com.dj.boot.mapper.KcMapper;
import com.dj.boot.model.BusinessException;
import com.dj.boot.model.DozerUtil;
import com.dj.boot.service.KcService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class KcServiceImpl extends ServiceImpl<KcMapper, KcEntity> implements KcService {

    @Override
    public List<KcDTO> findAll() throws BusinessException {
        List<KcBO> kcEntityList = getBaseMapper().findAll();
        return DozerUtil.mapList(kcEntityList, KcDTO.class);
    }
}
