package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class BaserController {
    /**
     * 跳转到主页
     * @return
     * @throws Exception
     */
    @RequestMapping("returnIndex")
    public String returnIndex()throws Exception{
        return "index";
    }

    /**
     * 跳转到登陆页面
     * @return
     * @throws Exception
     */
    @RequestMapping("returnLogin")
    public String returnLogin()throws Exception{
        return "login";
    }

    /**
     * 跳转到注册页面
     * @return
     * @throws Exception
     */
    @RequestMapping("returnRegist")
    public String returnRegist()throws Exception{
        return "regist";
    }
}
