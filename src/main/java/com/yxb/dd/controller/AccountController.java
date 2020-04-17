package com.yxb.dd.controller;

import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户处理
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    /**
     * 登录
     * @return 登录界面
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/userList")
    public String userList(Model model) {
        model.addAttribute("userList", accountService.getUserList());

        return "user_list";
    }

    @GetMapping(value = "/user/{id}/{operateType}")
    public String userDetain(String id, String operateType) {
        return "user_detain";
    }
}
