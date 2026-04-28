package com.example.demo.model;
public class User{
    private String patient;
    private String password;
    public String getUsername(){
        return patient;
    }
    public void setUsername(String patient)
    {
        this.patient=patient;
    }
      public String getPassword(){
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
}