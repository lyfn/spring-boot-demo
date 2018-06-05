package com.springboot.dome.springbootdeme.entity;

import java.io.Serializable;

/**
 * User: liyinfan
 * Date: 2018-06-05
 * Time: 13:35
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 3672087863941994157L;

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

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

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
