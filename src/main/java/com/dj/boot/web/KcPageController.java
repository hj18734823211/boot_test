package com.dj.boot.web;

import com.dj.boot.dto.UserDTO;
import com.dj.boot.model.DozerUtil;
import com.dj.boot.service.UserService;
import com.dj.boot.vo.UserVOResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.List;

@Controller
@RequestMapping("/kc/")
public class KcPageController {

    @Autowired
    private UserService userService;

    @RequestMapping("toTest")
    public String toTest(){
        return "kc/test";
    }

    @RequestMapping("toList")
    public String toLogin(){
        return "kc/list";
    }

    @RequestMapping("toDetail")
    public String toDetail(Integer kcId, Model model){
        List<UserDTO> userDTOList = userService.findUserByKcId(kcId);
        model.addAttribute("userDTOList", DozerUtil.mapList(userDTOList, UserVOResp.class));
        return "kc/detail";
    }

}
