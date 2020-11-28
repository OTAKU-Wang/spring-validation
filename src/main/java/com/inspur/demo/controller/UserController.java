package com.inspur.demo.controller;

import com.inspur.demo.model.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getUser",method = {RequestMethod.POST})
    public User getUser(@Validated @RequestBody User user){
        return new User();
    }
}
