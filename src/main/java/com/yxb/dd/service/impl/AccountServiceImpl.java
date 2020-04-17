package com.yxb.dd.service.impl;

import com.yxb.dd.mapper.AccountMapper;
import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
 * 账户服务
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public List<UserDTO> getUserList() {
        return accountMapper.selectUserList();
    }

    @Override
    public UserDTO getUser(BigInteger id) {
        return accountMapper.selectUserById(id);
    }
}
