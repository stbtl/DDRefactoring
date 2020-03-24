package com.yxb.dd.config;

import com.yxb.dd.security.AuthenticationProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationProviderImpl authenticationProvider;

    /**
     * 验证，登录配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // 请求授权
                .anyRequest() // 所有请求
                .authenticated() // 都要验证
                .and()
                .formLogin() // 以下是对登录的设置
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .usernameParameter("txtUsername")
                .passwordParameter("txtPassword")
                .successForwardUrl("/index")
                .failureUrl("/login?error=true").permitAll();
    }

    /**
     * 登录验证处理
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);
    }
}