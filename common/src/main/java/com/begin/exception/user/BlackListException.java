package com.begin.exception.user;

public class BlackListException extends UserException{
    public BlackListException() {
        super("login.blocked", null);
    }
}
