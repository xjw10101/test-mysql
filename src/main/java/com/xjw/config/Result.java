package com.xjw.config;

import com.xjw.entity.User;

import java.util.HashMap;

public class Result extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public Result setData(User data) {
        Result result = new Result();
        result.put("data", data);
        return result;
    }

    public static Result ok(String msg) {
        Result result = new Result();
        result.put("msg", msg);
        return result;
    }

}
