package com.dongtian.seckillsystem.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
@Entity(name = "user")
@Table(name = "user")
public class User {
    @Id
    @Column(name="user_id",nullable = false, unique = true, insertable = false)
    private Integer userId;

    @Column(name="username")
    @NotBlank(message="用户名不能为空")
    private String userName;

    @Column(name="password")
    @NotBlank(message="密码不能为空")
    private String password;

    @Column(name="email")
    @NotBlank(message="邮箱不能为空")
    private String email;

    @Column(name="phone")
    @NotBlank(message="电话不能为空")
    private String phone;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="update_time")
    private Date updateTime;

}
