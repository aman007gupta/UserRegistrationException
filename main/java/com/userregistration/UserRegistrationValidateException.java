package com.userregistration;

public class UserRegistrationValidateException extends Throwable {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }
    public ExceptionType type;
    public UserRegistrationValidateException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
