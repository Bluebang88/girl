package com.example.girl.controller;

import com.example.girl.domain.Result;
import com.example.girl.service.UserService;
import com.example.girl.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Blue
 * @date 2018/6/15 0:19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public Result findUserById(@PathVariable("id") Integer id){
        return ResultUtil.success(userService.findUserById(id));
    }

}
