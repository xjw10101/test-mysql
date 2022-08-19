package com.xjw.controller;

import com.xjw.config.Result;
import com.xjw.entity.User;
import com.xjw.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class MysqlController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/getUser")
    public Result getUserMessage(@RequestParam int userId) {
        Result result = new Result();
        User user = userService.queryUserMessageById(userId);
        return result.setData(user);
    }

}
