package com.yxb.dd.security;

import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import com.yxb.relcommon.security.AES_CBCUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

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
        // 邮箱
        String mail = authentication.getName().trim();
        // 密码
        String password = authentication.getCredentials().toString().trim();

        if (StringUtils.isEmpty(mail)) {
            throw new UsernameNotFoundException("邮箱不能为空！");
        }

        if (StringUtils.isEmpty(password)) {
            throw new BadCredentialsException("密码不能为空！");
        }

        UserDTO userDTO = accountService.getUserByMail(mail);

        if (userDTO == null) {
            throw new UsernameNotFoundException("邮箱或密码不正确！");
        }

        // 加密后的输入密码
        String encodePassword = AES_CBCUtils.encode(password, mail, userDTO.getSalt());
        // 加密后密码和数据库不一致的情况
        if (!encodePassword.equals(userDTO.getPassword())) {
            throw new BadCredentialsException("邮箱或密码不正确！");
        }

        return new UsernamePasswordAuthenticationToken(userDTO, userDTO.getId(), authentication.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
