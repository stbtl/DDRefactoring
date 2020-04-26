package com.yxb.dd.service.impl;

import com.yxb.dd.mapper.AccountMapper;
import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.model.dto.UserRoleDTO;
import com.yxb.dd.service.AccountService;
import com.yxb.relcommon.security.AES_CBCUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.keygen.KeyGenerators;
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
    public UserDTO getUserById(BigInteger id) {
        return accountMapper.selectUserById(id);
    }

    @Override
    public List<UserRoleDTO> getUserRoleList() {
        return accountMapper.selectUserRoleList();
    }

    @Override
    public int addUser(UserDTO userDTO) {
        String salt = KeyGenerators.string().generateKey();
        String encodingPwd = AES_CBCUtils.encode(userDTO.getPassword(), userDTO.getMail(), salt);
        userDTO.setSalt(salt);
        userDTO.setPassword(encodingPwd);
        return accountMapper.insertUser(userDTO);
    }

    @Override
    public int modUser(UserDTO userDTO) {
        return accountMapper.updateUserById(userDTO);
    }

    @Override
    public int deleteUserById(BigInteger id) {
        return accountMapper.deleteUserById(id);
    }
}
