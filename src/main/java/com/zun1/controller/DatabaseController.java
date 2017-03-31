package com.zun1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 王洋 on 2017/3/30.
 */
@Controller
public class DatabaseController {

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String index() {

        return "static";
    }

}
