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
     * 获取用户信息
     *
     * @param mail 邮箱
     * @return 用户信息
     */
    UserDTO selectUserByMail(String mail);

    List<UserDTO> selectUserList();

    UserDTO selectUserById(BigInteger id);

    int insertUser(UserDTO userDTO);

    List<UserRoleDTO> selectUserRoleList();

    int updateUserForLogin(UserDTO userDTO);

    int updateUserById(UserDTO userDTO);
}
