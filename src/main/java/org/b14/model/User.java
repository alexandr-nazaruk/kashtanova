package org.b14.model;

/**
 * Created by onazaruk on 15.02.2016.
 */

public class User {
    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private String email;
    private int apartment;
    private String password;
    private boolean sex;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public User(String name, String email, int appartment) {
        this.name = name;
        this.email = email;
        this.apartment = appartment;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int appartment) {
        this.apartment = appartment;
    }



}
