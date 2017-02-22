package com.zun1.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 王洋 on 2017/2/17.
 */
public class DateConverter implements Converter<String, Date>{

    private String pattern;

    public DateConverter(String pattern) {
        this.pattern = pattern;
    }

    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }
}
