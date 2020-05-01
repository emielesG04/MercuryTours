package com.pruebadocker.autweb.models;

public class DataEnteredLoguinMercury {
    private String userName;
    private String password;

    public DataEnteredLoguinMercury(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }

}
