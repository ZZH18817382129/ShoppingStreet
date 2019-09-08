package com.iotek.service.impl;

import com.iotek.mapper.UserMapper;
import com.iotek.model.User;
import com.iotek.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 验证用户名是否存在
     * @param loginName
     * @return
     * @throws Exception
     */
    @Override
    public boolean verifyLoginName(String loginName) throws Exception {
        User user=userMapper.findUserByName(loginName);
        if (user==null){
            return true;//当用户名不存在时返回真
        }
        return false;
    }
}
