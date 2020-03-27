package com.yxb.dd.service;

import com.yxb.dd.dao.AccountDAO;
import com.yxb.dd.model.dataobject.UserDO;
import com.yxb.dd.model.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDAO accountDAO;

    public UserDTO getUser(UserDTO userDTO) {

        UserDO userDO = new UserDO();
        userDO.setId(userDTO.getId());
        userDO.setPassword(userDTO.getPassword());

        return accountDAO.getUser(userDO);
    }
}
