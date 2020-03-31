package com.yxb.dd.service.impl;

import com.yxb.dd.mapper.AccountMapper;
import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 账户服务
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public UserDTO getUserByNameAndPwd(String username, String password) {
        return accountMapper.selectUserByNameAndPwd(username, password);
    }
}
