package com.example.girl.serviceImpl;

import com.example.girl.mapper.SysUserMapper;
import com.example.girl.pojo.SysUser;
import com.example.girl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Blue
 * @date 2018/6/15 0:14
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser findUserById(Integer id) {
        return sysUserMapper.findUserById(id);
    }
}
