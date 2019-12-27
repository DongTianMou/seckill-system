package com.dongtian.seckillsystem.service;

import com.dongtian.seckillsystem.model.User;
import com.dongtian.seckillsystem.vo.UserVo;

public interface UserService {

    void register(User user);

    User selectByUserName(String userName);

    User updateByPassword(String email,String password);

    String login(String username,String password);
}
