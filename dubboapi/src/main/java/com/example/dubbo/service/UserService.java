package com.example.dubbo.service;

import com.example.dubbo.po.User;

/**
 * @Description :
 * @Author : 苏俊强
 * @Date : 2019/3/25
 */

public interface UserService {
    User selectUserById(int id);
}
