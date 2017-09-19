package com.redcode.demo.entity;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/9/13.
 */

public class Tutorial implements Serializable {

    private static final long serialVersionUID = 3796748017507416430L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
