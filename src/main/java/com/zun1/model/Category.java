package com.zun1.model;

import java.io.Serializable;

/**
 * Created by 王洋 on 2017/1/23.
 */
public class Category implements Serializable {
    private int id;
    private String name;

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
