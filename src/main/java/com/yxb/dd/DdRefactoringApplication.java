package com.yxb.dd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 主程序入口
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@SpringBootApplication
@EnableCaching
public class DdRefactoringApplication {

    /**
     * 主程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DdRefactoringApplication.class, args);
    }
}
