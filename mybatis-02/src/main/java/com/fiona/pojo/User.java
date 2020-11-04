package com.fiona.pojo;

public class User {
    private int id;
    private String name;
    private String mypassword;

    public User(int id, String name, String mypassword) {
        this.id = id;
        this.name = name;
        this.mypassword = mypassword;
    }

    public User() {
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

    public String getMypassword() {
        return mypassword;
    }

    public void setMypassword(String mypassword) {
        this.mypassword = mypassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mypassword='" + mypassword + '\'' +
                '}';
    }
}
