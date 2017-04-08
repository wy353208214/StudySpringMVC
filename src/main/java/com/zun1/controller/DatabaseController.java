package com.zun1.controller;

import com.zun1.mapper.UserMapper;
import com.zun1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.util.List;

/**
 * Created by 王洋 on 2017/3/30.
 */
@Controller
public class DatabaseController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String index(HttpSession httpSession) {
        User user = userMapper.selectUser(1);
        httpSession.setAttribute("id", user.getId());
        httpSession.setAttribute("name", user.getName());
        httpSession.setAttribute("age", user.getAge());
        return "static";
    }

    @RequestMapping(value = "insertUser")
    public String insert(){
        User user = new User();
        user.setAge(13);
        user.setName("拉拉");
        userMapper.insert(user);
        return "index";
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String users(Model model) {
        List<User> users = userMapper.selectUsers();
        model.addAttribute("users", users);
        return "users";
    }

}
