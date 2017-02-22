package com.zun1.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import com.zun1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * O
 * Created by 王洋 on 2016/11/29.
 */
@Controller
public class MainController {

    @Autowired
    ApplicationContext act;

    //获取bean
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        Car car = act.getBean("car", Car.class);
        System.out.println(car.getPeople().getName());
        System.out.println(car.getCarName());
        return "index";
    }

    //打印json数据
    @RequestMapping(value = "/showJson", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String showJson() {
        Car car = act.getBean("car", Car.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(car);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }


    @RequestMapping(value = "/showJson2")
    public void showJson2(HttpServletResponse response, PrintWriter printWriter) {
        response.setContentType("text/html;charset=UTF-8");
        Car car = act.getBean("car", Car.class);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            printWriter.write(objectMapper.writeValueAsString(car));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    //PathVariable使用
    @RequestMapping(value = "/{id}")
    public String getID(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "static";
    }

    @ModelAttribute
    public void beforePrint() {

    }

}
