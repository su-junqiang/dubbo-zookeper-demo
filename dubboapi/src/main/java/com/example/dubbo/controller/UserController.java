package com.example.dubbo.controller;


import com.example.dubbo.po.User;
import com.example.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : 苏俊强
 * @Date : 2019/3/25
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("selectUserById/{id}")
    public String selectUserById(@PathVariable("id") int id){
        System.out.println(id);
       User user= userService.selectUserById(id);
        return "ok";
    }
}
