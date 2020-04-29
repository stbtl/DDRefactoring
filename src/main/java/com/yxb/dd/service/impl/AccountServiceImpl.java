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

    /**
     * 数据库Mapper
     */
    @Autowired
    AccountMapper accountMapper;

    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    @Override
    public List<UserDTO> getUserList() {
        return accountMapper.selectUserList();
    }

    /**
     * 通过id获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public UserDTO getUserById(BigInteger id) {
        return accountMapper.selectUserById(id);
    }

    /**
     * 获取用户权限列表
     * @return 用户权限列表
     */
    @Override
    public List<UserRoleDTO> getUserRoleList() {
        return accountMapper.selectUserRoleList();
    }

    /**
     * 添加新用户
     * @param userDTO 用户信息
     * @return 添加结果
     */
    @Override
    public int addUser(UserDTO userDTO) {
        String salt = KeyGenerators.string().generateKey();
        String encodingPwd = AES_CBCUtils.encode(userDTO.getPassword(), userDTO.getMail(), salt);
        userDTO.setSalt(salt);
        userDTO.setPassword(encodingPwd);
        return accountMapper.insertUser(userDTO);
    }

    /**
     * 更新用户信息
     * @param userDTO 用户信息
     * @return 更新结果
     */
    @Override
    public int modUser(UserDTO userDTO) {
        return accountMapper.updateUserById(userDTO);
    }

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除结果
     */
    @Override
    public int deleteUserById(BigInteger id) {
        return accountMapper.deleteUserById(id);
    }
}
