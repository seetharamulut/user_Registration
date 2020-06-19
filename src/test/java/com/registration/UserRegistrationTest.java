package com.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
    Validation validation = new Validation();

    @Test
    public void properFirstName_shouldReturnTrue() {
    boolean valid=validation.validateFirstName("Kalyan");
        Assert.assertEquals(true, valid);
    }
    @Test
    public void firstName_noUppercase_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kalyan");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void FirstName_improperLength_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kal");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void FirstName_withSpecialCharacters_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kalyan@");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void FirstName_withNumbers_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kalyan123");
        Assert.assertEquals(false, valid);
    }
}
