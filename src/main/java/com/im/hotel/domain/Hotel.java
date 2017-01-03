package com.im.hotel.domain;

import java.io.Serializable;

public class Hotel implements Serializable {

    private static final long serialVersionUID = -5577579081118070434L;

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
}
