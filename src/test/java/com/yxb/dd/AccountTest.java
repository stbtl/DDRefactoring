package com.yxb.dd;

import com.yxb.dd.mapper.AccountMapper;
import com.yxb.dd.model.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

/**
 * @author YingXB
 * @date 2020/05/22 16:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {

    @Autowired
    AccountMapper accountMapper;

    @Test
    public void aaTest() {
        UserDTO userDTO = accountMapper.selectUserById(new BigInteger("3"));

        System.out.println(userDTO);
    }
}
