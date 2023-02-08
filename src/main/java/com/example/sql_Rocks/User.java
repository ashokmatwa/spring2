package com.example.sql_Rocks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {
    @Id
    @Column(unique = true)
    private int id;
    private String name;
    private String age;

    @Column(unique = true)
    private String email;

    @Column(name = "country_name")
    private String country;
    public User() {
    }

//    public User(int id, String name, String age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }


    public User(int id, String name, String age, String email, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
