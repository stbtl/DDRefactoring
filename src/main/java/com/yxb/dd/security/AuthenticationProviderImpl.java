package com.yxb.dd.security;

import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * 登录验证
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    private AccountService accountService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 用户名
        String username = authentication.getName();
        // 密码
        String password = authentication.getCredentials().toString();

        UserDTO userDTO = accountService.getUserByNameAndPwd(username, password);

        return new UsernamePasswordAuthenticationToken(userDTO, username, authentication.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
