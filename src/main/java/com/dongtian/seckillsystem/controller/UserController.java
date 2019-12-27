package com.dongtian.seckillsystem.controller;

import com.dongtian.seckillsystem.enums.ResultCode;
import com.dongtian.seckillsystem.model.User;
import com.dongtian.seckillsystem.service.UserService;
import com.dongtian.seckillsystem.vo.ResultVo;
import com.dongtian.seckillsystem.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
@Slf4j
public class UserController extends BasicController{
    @Autowired
    private UserService userService;
    @RequestMapping
    public ResultVo login(@ModelAttribute(value="username") @Valid String username, BindingResult bindingResultUserName,
                          @ModelAttribute(value="password") @Valid String password, BindingResult bindingResult){

        String token = userService.login(username,password);

        if(bindingResult.hasErrors()| bindingResultUserName.hasErrors()){
            return ResultVo.error( ResultCode.FAIL.getCode(),"表单填写错误");
        }
        User dbUser = userService.selectByUserName(username);

        if(dbUser==null){
            return ResultVo.error( ResultCode.FAIL.getCode(),"用户不存在");
        }else{
            //生成一个token,把 { key:token value:user}存进redis
            //todo

        }
        return null;
    }
}
