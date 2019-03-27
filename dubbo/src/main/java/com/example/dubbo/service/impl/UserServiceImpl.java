package com.example.dubbo.service.impl;

import com.example.dubbo.po.User;
import com.example.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description :
 * @Author : 苏俊强
 * @Date : 2019/3/25
 */
@Service("UserService")

public class UserServiceImpl implements UserService {
    @Override
    public User selectUserById(int id) {
        System.out.println("这里是dubbo的服务端");
        System.out.println("需要查询的用户为" + id);
        return null;
    }
}
