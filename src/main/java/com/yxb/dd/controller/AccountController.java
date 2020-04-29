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

    /**
     * 账户服务类
     */
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

    /**
     * 迁移到用户列表界面
     * @param model 用户列表信息
     * @return 用户列表界面
     */
    @GetMapping(value = "/userList")
    public String toUserListPage(Model model) {
        model.addAttribute("userList", accountService.getUserList());

        return "user_list";
    }

    /**
     * 迁移到用户添加界面
     * @param model 用户
     * @return 用户添加界面
     */
    @GetMapping("/user")
    public String toAddUserPage(Model model) {
        model.addAttribute("roleList", accountService.getUserRoleList());

        return "user_detail";
    }

    /**
     * 添加用户
     * @param userDTO 用户信息
     * @return 添加成功，返回用户列表界面
     */
    @PostMapping("/user")
    public String addUser(UserDTO userDTO) {

        accountService.addUser(userDTO);

        return "redirect:/userList";
    }

    /**
     * 迁移到用户编辑界面
     * @param id 用户id
     * @param model 用户权限、用户信息
     * @return 用户编辑界面
     */
    @GetMapping(value = "/user/{id}")
    public String toEditUserPage(@PathVariable BigInteger id, Model model) {
        model.addAttribute("roleList", accountService.getUserRoleList());
        model.addAttribute("user", accountService.getUserById(id));
        return "user_detail";
    }

    /**
     * 修改用户
     * @param userDTO 用户信息
     * @return 修改成功，返回用户列表界面
     */
    @PutMapping("/user")
    public String modUser(UserDTO userDTO) {
        accountService.modUser(userDTO);
        return "redirect:/userList";
    }

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除成功，返回用户列表界面
     */
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable BigInteger id) {
        accountService.deleteUserById(id);
        return "redirect:/userList";
    }
}
