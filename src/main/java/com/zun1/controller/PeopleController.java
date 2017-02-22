package com.zun1.controller;

import com.zun1.model.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 王洋 on 2017/2/22.
 */
@Controller
public class PeopleController {

    @RequestMapping(value = "people")
    public String index(Model model) {
        model.addAttribute("people", new People());
        return "peopleAddForm";
    }

    @RequestMapping(value = "/people_save")
    public String savePeople(@ModelAttribute People people, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            System.out.println("code:" + fieldError.getCode() + "," + "field:" + fieldError.getField());
            return "peopleAddForm";
        }
        return "redirect:/people";
    }

}
