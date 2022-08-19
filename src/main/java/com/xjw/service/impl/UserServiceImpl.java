package com.xjw.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xjw.dao.UserDao;
import com.xjw.entity.User;
import com.xjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Resource
    private UserDao userDao;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public User queryUserMessageById(int userId) {
        User user = userDao.selectUserMessageById(userId);
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String jsonString = JSON.toJSONString(user);
        ops.set("user",jsonString,1, TimeUnit.MINUTES);
        return user;
    }
}
