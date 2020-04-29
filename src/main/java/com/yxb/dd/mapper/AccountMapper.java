package com.yxb.dd.mapper;

import com.yxb.dd.model.dto.UserDTO;
import com.yxb.dd.model.dto.UserRoleDTO;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

/**
 * 账户mapper
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
@Mapper
public interface AccountMapper {

    /**
     * 通过Mail获取用户信息
     *
     * @param mail 邮箱
     * @return 用户信息
     */
    UserDTO selectUserByMail(String mail);

    /**
     * 获取所有用户列表
     *
     * @return 用户列表
     */
    List<UserDTO> selectUserList();

    /**
     * 通过id获取用户信息
     * @param id 用户id
     * @return 用户信息
     */
    UserDTO selectUserById(BigInteger id);

    /**
     * 添加新用户
     * @param userDTO 用户信息
     * @return 添加结果
     */
    int insertUser(UserDTO userDTO);

    /**
     * 获取用户权限列表
     * @return 用户权限列表
     */
    List<UserRoleDTO> selectUserRoleList();

    /**
     * 更新用户信息(登录时用)
     * @param userDTO 用户信息
     * @return 更新结果
     */
    int updateUserForLogin(UserDTO userDTO);

    /**
     * 更新用户信息
     * @param userDTO 用户信息
     * @return 更新结果
     */
    int updateUserById(UserDTO userDTO);

    /**
     * 删除用户
     * @param id 用户id
     * @return 删除结果
     */
    int deleteUserById(BigInteger id);
}
