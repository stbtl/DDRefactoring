package com.yxb.dd.mapper;

import com.yxb.dd.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

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

    /**
     * 更新用户信息
     *
     * @param userDTO 用户信息
     * @return 更新件数
     */
    int updateUserById(UserDTO userDTO);
}
