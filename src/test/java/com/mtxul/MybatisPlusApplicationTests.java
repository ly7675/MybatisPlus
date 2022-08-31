package com.mtxul;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mtxul.mapper.UserMapper;
import com.mtxul.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void m1() {
        QueryWrapper<User> query = new QueryWrapper<>();
        userMapper.selectList(null).forEach(System.out::println);
    }
}
