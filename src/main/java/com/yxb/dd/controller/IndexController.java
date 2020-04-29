package com.yxb.dd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页处理
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Controller
public class IndexController {

    /**
     * 主页
     * @return 主页界面
     */
    @PostMapping("/index")
    public String index() {
        return "index";
    }
}
