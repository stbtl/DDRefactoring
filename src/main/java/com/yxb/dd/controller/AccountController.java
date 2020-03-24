package com.yxb.dd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户处理
 */
@Controller
public class AccountController {

    /**
     * 登录
     * @return 登录界面
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
