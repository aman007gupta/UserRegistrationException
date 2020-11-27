package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationRefactorTest {

    @Test
    public void userFirstName_Null_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(null);
        try {
            userRegistrationValidate.fName(null);
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void userFirstName_Empty_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(" ");
        try {
            userRegistrationValidate.fName();
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void userFirstName_FirstLetterCapitalAndMinimun3letter_ShouldReturnValidFirstNameOfUser() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("Aman");
        boolean result = userRegistrationValidate.fName("Aman");
        Assert.assertTrue(result);
    }

    @Test
    public void userFirstName_NotFirstLetterCapitalAndMinimun3letter_ShouldReturnInvalidUserFirstName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("man");
        boolean result = userRegistrationValidate.fName("man");
        Assert.assertFalse(result);
    }

    @Test
    public void userFirstName_AlphaNumeric_ShouldReturnInvalidUserFirstName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("m1an");
        boolean result = userRegistrationValidate.fName("m1an");
        Assert.assertFalse(result);
    }

    @Test
    public void userFirstName_NotFirstLetterCapitalAndNotMinimun3letter_ShouldReturnInvalidUserFirstName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("ma");
        boolean result = userRegistrationValidate.fName("ma");
        Assert.assertFalse(result);
    }

    @Test
    public void userLastName_Null_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(null);
        try {
            userRegistrationValidate.lName(null);
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void userLastName_Empty_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(" ");
        try {
            userRegistrationValidate.lName();
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void userLastName_FirstLetterCapitalAndMinimun3letter_ShouldReturnValidLastNameOfUser() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("Aman");
        boolean result = userRegistrationValidate.lName("Aman");
        Assert.assertTrue(result);
    }

    @Test
    public void userLastName_NotFirstLetterCapitalAndMinimun3letter_ShouldReturnInvalidUserLastName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("man");
        boolean result = userRegistrationValidate.lName("man");
        Assert.assertFalse(result);
    }

    @Test
    public void userLastName_AlphaNumeric_ShouldReturnInvalidUserLastName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("m1an");
        boolean result = userRegistrationValidate.lName("m1an");
        Assert.assertFalse(result);
    }

    @Test
    public void userLastName_NotFirstLetterCapitalAndNotMinimun3letter_ShouldReturnInvalidUserLastName() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("ma");
        boolean result = userRegistrationValidate.lName("ma");
        Assert.assertFalse(result);
    }

    @Test
    public void userEmail_Null_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(null);
        try {
            userRegistrationValidate.email(null);
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void userEmail_Empty_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(" ");
        try {
            userRegistrationValidate.email();
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void userEmail_Proper_ShouldReturnValidEmailIdOfUser() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("aman@gmail.com");
        boolean result = userRegistrationValidate.email("aman@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void userEmail_NotContainAttheRateSymbol_ShouldReturnInValidUserEmailId() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("aman@gmail.com");
        boolean result = userRegistrationValidate.email("amangmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void userMobile_Null_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(null);
        try {
            userRegistrationValidate.mobileNo(null);
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void userMobileNo_Empty_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(" ");
        try {
            userRegistrationValidate.mobileNo();
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void userMobileNo_Proper_ShouldReturnValidMobileNoOfUser() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("91 9450291728");
        boolean result = userRegistrationValidate.mobileNo("91 9450291728");
        Assert.assertTrue(result);
    }

    @Test
    public void userMobileNo_MobileNoNotstartedWith6to9_ShouldReturnInvalidUserMobile() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("91 4450291728");
        boolean result = userRegistrationValidate.email("91 4450291728");
        Assert.assertFalse(result);
    }

    @Test
    public void userMobileNo_MobileNoNotContainSpace_ShouldReturnInvalidUserMobile() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("919450291728");
        boolean result = userRegistrationValidate.email("919450291728");
        Assert.assertFalse(result);
    }

    @Test
    public void userPassword_Null_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(null);
        try {
            userRegistrationValidate.lName(null);
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void userPassword_Empty_ThrowException() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate = new UserRegistrationValidate(" ");
        try {
            userRegistrationValidate.password();
        } catch (UserRegistrationValidateException e) {
            Assert.assertEquals(UserRegistrationValidateException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void userPassword_Proper_ShouldReturnValidPasswordOfUser() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("Aman123@");
        boolean result = userRegistrationValidate.password("Aman123@");
        Assert.assertTrue(result);
    }

    @Test
    public void userPassword_NotContainCapitalletter_ShouldReturnInValidUserPassword() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("man123@");
        boolean result = userRegistrationValidate.password("man123@");
        Assert.assertFalse(result);
    }

    @Test
    public void userPassword_NotContainspecialCharacter_ShouldReturnInValidUserPassword() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("man1232");
        boolean result = userRegistrationValidate.password("man1232");
        Assert.assertFalse(result);
    }

    @Test
    public void userPassword_NotContainsNumber_ShouldReturnInValidUserPassword() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("manasdj");
        boolean result = userRegistrationValidate.password("manasdj");
        Assert.assertFalse(result);
    }

    @Test
    public void userPassword_Lessthan8letter_ShouldReturnInValidUserPassword() throws UserRegistrationValidateException {
        UserRegistrationValidate userRegistrationValidate =new UserRegistrationValidate("Aan12@");
        boolean result = userRegistrationValidate.password("Aan12@");
        Assert.assertFalse(result);
    }
}
