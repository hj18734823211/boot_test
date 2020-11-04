package com.dj.boot.web;

import com.dj.boot.dto.KcDTO;
import com.dj.boot.model.DozerUtil;
import com.dj.boot.model.ResultModel;
import com.dj.boot.service.KcService;
import com.dj.boot.vo.KcVOResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kc/")
public class KcController {

    @Autowired
    private KcService kcService;

    @RequestMapping("list")
    public ResultModel list() throws Exception{
        List<KcDTO> kcDTOList = kcService.findAll();
        return new ResultModel().success(DozerUtil.mapList(kcDTOList, KcVOResp.class));
    }
}
