package com.yxb.dd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页处理
 */
@Controller
public class IndexController {

    /**
     * 主页
     * @return 主页界面
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
