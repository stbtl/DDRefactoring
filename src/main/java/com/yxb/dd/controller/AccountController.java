package com.yxb.dd.controller;

import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

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
    public String toUserListPage(Model model) {
        model.addAttribute("userList", accountService.getUserList());

        return "user_list";
    }

    @GetMapping("/user")
    public String toAddUserPage(Model model) {
        model.addAttribute("roleList", accountService.getUserRoleList());

        return "user_detail";
    }

    @PostMapping("/user")
    public String addUser(UserDTO userDTO) {

        accountService.addUser(userDTO);

        return "redirect:/userList";
    }

    @GetMapping(value = "/user/{id}")
    public String toEditUserPage(@PathVariable BigInteger id, Model model) {
        model.addAttribute("roleList", accountService.getUserRoleList());
        model.addAttribute("user", accountService.getUserById(id));
        return "user_detail";
    }

    @PutMapping("/user")
    public String modUser(UserDTO userDTO) {
        accountService.modUser(userDTO);
        return "redirect:/userList";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable BigInteger id) {
        accountService.deleteUserById(id);
        return "redirect:/userList"; 
    }
}
