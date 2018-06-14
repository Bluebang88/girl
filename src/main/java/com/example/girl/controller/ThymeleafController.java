package com.example.girl.controller;

import com.example.girl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Blue
 * @date 2018/6/14 11:15
 */
@Controller
@RequestMapping("/th")
public class ThymeleafController {
    @GetMapping("/goActive")
    public String goActive(Model model) {
        model.addAttribute("msg","米好");

        User user = new User();
        user.setId(1);
        user.setAge(19);
        user.setBirthday(new Date());
        user.setName("manager");
        user.setDesc("<font color='green'><b>hello blue</b></font>");
        model.addAttribute("myUser", user);

        User user2 = new User();
        user2.setId(2);
        user2.setAge(29);
        user2.setName("kkk");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        model.addAttribute("userList",userList);
        return "activeHTML";
    }
    @GetMapping("/goStatic")
    public String goStatic() {
        return "staticHTML";
    }

    @PostMapping("/postForm")
    public String postForm(User user) {
        System.out.println(user.getName());
        return "redirect:/th/goStatic";
    }
}
