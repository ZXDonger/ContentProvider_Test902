package com.example.zxdong.contentprovider_test902;

/**
 * Created by ZXDong on 2018/6/25.
 */

public class Contacts {
    private String name;
    private String number;
    private String sex;

    public Contacts(String name,String number,String sex){
        this.name=name;
        this.number=number;
        this.sex=sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
