package com.yxb.dd.service.impl;

import com.yxb.dd.mapper.AccountMapper;
import com.yxb.dd.model.dataobject.UserDO;
import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public UserDTO getUserByNameAndPwd(UserDO userDO) {
        return accountMapper.selectUserByNameAndPwd(userDO);
    }
}
