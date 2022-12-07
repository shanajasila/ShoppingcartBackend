package com.example.Newshoppingcartbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "signup")
public class Register {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String phoneno;
    private String email;
    private String password;
    private String confirmpassword;

    public Register() {
    }

    public Register(int id, String name, String address, String phoneno, String email, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneno=phoneno;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneno(String phoneno) {
        phoneno = phoneno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
