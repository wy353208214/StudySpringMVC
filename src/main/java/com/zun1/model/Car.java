package com.zun1.model;

import java.util.Date;

/**
 * Created by 王洋 on 2016/12/19.
 */
public class Car {

    private People people;
    private String carName;

    public Car() {
    }


    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
