package com.jmeo.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * Created by JmeoM on 2015/9/5.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name",nullable = true)
    private String name;
    @Column(name = "age",nullable = true)
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
