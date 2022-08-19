package com.xjw.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjw.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao extends BaseMapper<User> {

    User selectUserMessageById(@Param("userId") int userId);
}
