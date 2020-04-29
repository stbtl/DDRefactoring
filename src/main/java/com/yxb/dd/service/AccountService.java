package com.yxb.dd.service;

import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.model.dto.UserRoleDTO;

import java.math.BigInteger;
import java.util.List;

/**
 * 账户接口服务
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
public interface AccountService {

    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    public List<UserDTO> getUserList();

    /**
     * 通过id获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    public UserDTO getUserById(BigInteger id);

    /**
     * 获取用户权限列表
     * @return 用户权限列表
     */
    public List<UserRoleDTO> getUserRoleList();

    /**
     * 添加新用户
     * @param userDTO 用户信息
     * @return 添加结果
     */
    public int addUser(UserDTO userDTO);

    /**
     * 更新用户信息
     * @param userDTO 用户信息
     * @return 更新结果
     */
    public int modUser(UserDTO userDTO);

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除结果
     */
    public int deleteUserById(BigInteger id);
}
