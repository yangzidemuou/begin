package com.ruoyi.begin;

import com.ruoyi.begin.Dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeginApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    void contextLoads() {



    }

}
