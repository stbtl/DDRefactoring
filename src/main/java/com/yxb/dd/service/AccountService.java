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
     * @param mail 邮箱
     * @return 用户信息
     */
    public UserDTO getUserByMail(String mail);
}
