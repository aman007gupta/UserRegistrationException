package com.userregistration;

public class UserRegistrationValidate {
    String message;

    public UserRegistrationValidate(String message) {
        this.message = message;
    }

    public boolean fName(String message) throws UserRegistrationValidateException {
        this.message = message;
        return fName();
    }

    public boolean lName(String message) throws UserRegistrationValidateException {
        this.message = message;
        return lName();
    }

    public boolean fName() throws UserRegistrationValidateException {
        try {
            if (message.length() == 0)
                throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, "Please enter valid user first name");
            if (message.matches("^[A-Z]{1}[a-z]{2,}$")) {
                System.out.println("Valid first name of user");
                return true;
            } else {
                System.out.println("Invalid user first name");
                return false;
            }
        } catch (NullPointerException e) {
            throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, "Please enter valid user first name");
        }
    }

    public boolean lName() throws UserRegistrationValidateException {
        try {
            if (message.matches("^[A-Z]{1}[]a-z]{2,}")) {
                System.out.println("Valid last name of User");
                return true;
            } else {
                System.out.println("Invalid user last name");
                return false;
            }
        } catch (NullPointerException e) {
            throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, "Please enter proper user last name");
        }
    }

    public boolean email(String message) throws UserRegistrationValidateException {
        this.message = message;
        return email();
    }


    public boolean email() throws UserRegistrationValidateException {
        try {
            if (message.matches("^[0-9a-zA-Z]{1,}([._+-]?[0-9a-zA-Z]{1,})?(@[0-9a-zA-Z]{1,})([.][a-zA-Z]{2,})([.]?[a-zA-Z]{2})?$")) {
                System.out.println("Valid email id of User");
                return true;
            } else {
                System.out.println("Invalid user email id");
                return false;
            }
        } catch (NullPointerException e) {
            throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, "Please enter proper user email id");
        }
    }

    public boolean mobileNo(String message) throws UserRegistrationValidateException {
        this.message = message;
        return mobileNo();
    }

    public boolean mobileNo() throws UserRegistrationValidateException {
        try {
            if (message.matches("([0-9]{2})[ ][6-9]{1}[0-9]{9}")) {
                System.out.println("Valid mobile no of User");
                return true;
            } else {
                System.out.println("Invalid user mobile no");
                return false;
            }
        } catch (NullPointerException e) {
            throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, "Please enter proper user mobile no");
        }
    }

    public boolean password(String message) throws UserRegistrationValidateException {
        this.message = message;
        return password();
    }

    public boolean password() throws UserRegistrationValidateException {
        try {
            if (message.matches("(?=.*[*.!@$%^&])(?=.*[A-Z])(?=.*[0-9])(.{8,})")) {
                System.out.println("Valid password of User");
                return true;
            } else {
                System.out.println("Invalid user password");
                return false;
            }
        } catch (NullPointerException e) {
            throw new UserRegistrationValidateException(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, "Please enter proper user password");
        }
    }
}