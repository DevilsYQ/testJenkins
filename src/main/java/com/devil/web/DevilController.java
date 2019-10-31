package com.devil.web;

import com.alibaba.fastjson.JSON;
import com.devil.dao.UserMapper;
import com.devil.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DevilController {

    @Autowired
    UserMapper mapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "你好";

    }
}
