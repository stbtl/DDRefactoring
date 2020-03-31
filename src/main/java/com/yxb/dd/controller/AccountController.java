package com.yxb.dd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户处理
 *
 * @author YingXB
 * @date 2020/03/31 9:49
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
