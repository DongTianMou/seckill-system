package com.dongtian.seckillsystem.service.Impl;

import com.dongtian.seckillsystem.dao.UserDao;
import com.dongtian.seckillsystem.model.User;
import com.dongtian.seckillsystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void register(User user) {
        if (user==null){
            log.error("用户信息为空，增加失败");
        }else{
            userDao.save( user );
        }
    }

    @Override
    public User selectByUserName(String userName) {
        if (StringUtils.isEmpty(userName)){
            log.error("查找失败，用户名为空");
            return null;
        }
        return userDao.findUserByUserName(userName);
    }

    @Override
    public User updateByPassword(String email,String password) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        String token ="";
        return token;
    }
}
