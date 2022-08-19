package com.likelion.threetier.user.model;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate createdOn;
    private String userName;
    private String password;

    public User() {

    }

    public User(int id, String name, LocalDate createdOn, String userName, String password) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
        this.userName = userName;
        this.password = password;
    }

    public User(String name, LocalDate createdOn, String userName, String password) {
        this.name = name;
        this.createdOn = createdOn;
        this.userName = userName;
        this.password = password;
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

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdOn=" + createdOn +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
