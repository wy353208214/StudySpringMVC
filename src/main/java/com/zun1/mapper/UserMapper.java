package com.zun1.mapper;

import com.zun1.model.User;

import java.util.List;

/**
 * Created by 王洋 on 2017/4/8.
 */
public interface UserMapper {
    User selectUser(int id);
    int insert(User user);
    List<User> selectUsers();
}
