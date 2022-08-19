package com.xjw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xjw.entity.User;

public interface UserService extends IService<User> {
    User queryUserMessageById(int userId);
}