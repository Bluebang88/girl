package com.example.girl.service;

import com.example.girl.pojo.SysUser;

/**
 * @author Blue
 * @date 2018/6/15 0:13
 */
public interface UserService {
    SysUser findUserById(Integer id);
}
