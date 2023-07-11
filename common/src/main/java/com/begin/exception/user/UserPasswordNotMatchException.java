package com.begin.exception.user;

public class UserPasswordNotMatchException extends UserException{
    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }
}
