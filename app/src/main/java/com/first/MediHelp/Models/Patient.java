package com.first.MediHelp.Models;

public class Patient {
    private String name;
    private String email;
    private String phone;
    private String pass;
    public Patient(){
        
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Patient(String name , String email , String phone , String pass){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
    }
}
