package com.usermanagement.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the the user with id : " + id);
    }
}
