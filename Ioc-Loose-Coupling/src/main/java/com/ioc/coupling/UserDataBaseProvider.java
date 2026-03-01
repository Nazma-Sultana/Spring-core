package com.ioc.coupling;

public class UserDataBaseProvider implements  UserDataProvider{
    public String getUserDetails(){
        return "User Details From Database";
    }

}