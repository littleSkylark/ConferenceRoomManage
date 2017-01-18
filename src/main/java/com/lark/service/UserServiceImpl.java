package com.lark.service;

import com.lark.dao.mapper.UserMapper;
import com.lark.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by skylark on 2017/1/17.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
