package com.example.girl.controller;

import com.example.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Blue
 * @date 2018/6/12 10:59
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String say(@RequestParam("id") Integer id, Integer age) {

        System.out.println("测试。。。。。。。。。");

        return "Hello SpringBoot" + girlProperties.getCupSize() + "，" + id + "，" + age;

    }
}
