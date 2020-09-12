package com.yuu.knife4j.boot.demo.service;

import com.yuu.knife4j.boot.demo.entity.User;

import java.util.List;

/**
 * @ClassName: IUserService
 * @Auther: Yuu
 * @Date: 2020/9/12 12:15
 * @Description: 用户业务逻辑接口
 */
public interface IUserService {

    /**
     * 分页查询用户列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<User> list(Integer pageNo, Integer pageSize);
}
