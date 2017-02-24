package com.example.demo.web;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/24.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String all() {
        User user = new User();
        user.setName("哈哈哈哈哈");
        user.setAge(22);

        userService.save(user);

        return "success";
    }

}
