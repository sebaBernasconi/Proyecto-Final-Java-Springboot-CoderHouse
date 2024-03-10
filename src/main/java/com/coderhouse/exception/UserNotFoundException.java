package com.coderhouse.exception;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String msj){
        super(msj);
    }
}
