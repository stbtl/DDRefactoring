package com.yxb.dd.service;

import com.yxb.dd.model.dataobject.UserDO;
import com.yxb.dd.model.dto.UserDTO;

public interface AccountService {

    public UserDTO getUserByNameAndPwd(UserDO userDO);
}
