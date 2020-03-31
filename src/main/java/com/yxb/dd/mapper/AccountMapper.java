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
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     */
    UserDTO selectUserByNameAndPwd(String username, String password);
}
