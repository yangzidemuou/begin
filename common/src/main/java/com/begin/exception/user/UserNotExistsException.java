package com.begin.exception.user;

public class UserNotExistsException extends UserException {
    private static final long servialVersionUID=1L;


    public UserNotExistsException() {
        super("user.not.exists", null);
    }
}
