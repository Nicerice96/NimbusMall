package com.userservice.user_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String userName;
    private String userPassword;



    public User(){

    }

    public User(String userName, String userPassword){

        this.userName = userName;
        this.userPassword = userPassword;

    }
        public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    
}
