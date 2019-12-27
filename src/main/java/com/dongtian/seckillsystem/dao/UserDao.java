package com.dongtian.seckillsystem.dao;

import com.dongtian.seckillsystem.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    User findUserByUserName(String userName);
}
