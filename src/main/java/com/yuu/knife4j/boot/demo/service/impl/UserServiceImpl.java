package com.yuu.knife4j.boot.demo.service.impl;

import com.yuu.knife4j.boot.demo.entity.User;
import com.yuu.knife4j.boot.demo.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: IUserServiceImpl
 * @Auther: Yuu
 * @Date: 2020/9/12 12:16
 * @Description: 用户 - 业务逻辑实现
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public List<User> list(Integer pageNo, Integer pageSize) {
        // 模拟数据库查询
        List<User> users = new ArrayList<>();
        for (int i = (pageNo - 1) * pageSize; i < (pageNo) * pageSize; i++) {
            User userEntity = new User();
            userEntity.setId(i);
            userEntity.setUsername("小" + i);
            userEntity.setPassword(UUID.randomUUID().toString());

            if (i % 2 == 0) {
                userEntity.setSex("男");
            } else {
                userEntity.setSex("女");
            }
            users.add(userEntity);
        }
        return users;
    }
}
