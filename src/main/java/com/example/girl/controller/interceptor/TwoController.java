package com.example.girl.controller.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("two")
public class TwoController {

	@RequestMapping("/hello")
    public String index() {

        return "hello springboot";
    }

}