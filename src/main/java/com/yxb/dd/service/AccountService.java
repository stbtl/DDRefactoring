package com.yxb.dd.service;

import com.yxb.dd.model.dto.UserDTO;

/**
 * 账户接口服务
 *
 * @author YingXB
 * @date 2020/03/31 9:49
 */
public interface AccountService {

    /**
     * 获取用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     */
    public UserDTO getUserByNameAndPwd(String username, String password);
}
