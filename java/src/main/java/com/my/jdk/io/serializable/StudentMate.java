package com.my.jdk.io.serializable;

import java.io.Serializable;

/**
 * Created by jli on 3/19/2018.
 */
public class StudentMate implements Serializable {
    private static final long serialVersionUID = 123456789L;
    public static  String countryName="china";
    private int id;
    private String name;
    private String sex;
    transient private int aga;

    public int getAga() {
        return aga;
    }

    public void setAga(int aga) {
        this.aga = aga;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        String s="adaf";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
