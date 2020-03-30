package com.yxb.dd.mapper;

import com.yxb.dd.model.dataobject.UserDO;
import com.yxb.dd.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    UserDTO selectUserByNameAndPwd(UserDO userDO);
}
