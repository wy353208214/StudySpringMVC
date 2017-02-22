package com.zun1.validator;

import com.zun1.model.People;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by 王洋 on 2017/2/22.
 */
public class PeopleValidator implements Validator {

    public boolean supports(Class<?> clazz) {
        return People.class.isAssignableFrom(clazz);
    }

    public void validate(Object target, Errors errors) {
        People people = (People) target;
        ValidationUtils.rejectIfEmpty(errors, "name", "peopleName.required");
        if (people.getAge() <= 0)
            errors.rejectValue("age", "peopleAge.required");
    }
}
