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

    public List<UserDTO> getUserList();

    public UserDTO getUserById(BigInteger id);

    public List<UserRoleDTO> getUserRoleList();

    public int addUser(UserDTO userDTO);

    public int modUser(UserDTO userDTO);
}
