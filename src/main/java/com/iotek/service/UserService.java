package com.iotek.service;

public interface UserService {
    //验证用户名是否存在
    public boolean verifyLoginName(String loginName)throws Exception;
}
