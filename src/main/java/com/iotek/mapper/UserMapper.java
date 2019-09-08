package com.iotek.mapper;

import com.iotek.model.User;

public interface UserMapper {
    //验证用户名是否存在
    public User findUserByName(String loginName)throws Exception;

}
