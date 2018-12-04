package com.smr.pc.java89.lamdba.lamdba05;

import lombok.Data;

@Data
public class Person {

    private String username;
    private Integer age;

    public Person(String username,Integer age){
        super();
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
