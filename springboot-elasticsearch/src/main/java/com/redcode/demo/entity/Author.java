package com.redcode.demo.entity;

import java.io.Serializable;

/**
 * Created by zhiyu.zhou on 2017/9/13.
 */
public class Author implements Serializable {

    private static final long serialVersionUID = 7126762480456685573L;
    //Author Id
    private Long id;
    //Author name
    private String name;
    //des
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
