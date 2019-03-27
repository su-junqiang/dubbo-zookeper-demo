package com.example.dubbo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description :
 * @Author : 苏俊强
 * @Date : 2019/3/25
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private  String password;
}
