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
    public void firstName_improperLength_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("Ka");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void firstName_withSpecialCharacters_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kalyan@");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void firstName_withNumbers_shouldReturnFalse() {
        boolean valid=validation.validateFirstName("kalyan123");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void properLastName_shouldReturnTrue() {
        boolean valid=validation.validateLastName("Thumurugoti");
        Assert.assertEquals(true, valid);
    }
    @Test
    public void lastName_noUppercase_shouldReturnFalse() {
        boolean valid=validation.validateLastName("thumurugoti");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void lastName_improperLength_shouldReturnFalse() {
        boolean valid=validation.validateLastName("Th");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void lastName_withSpecialCharacters_shouldReturnFalse() {
        boolean valid=validation.validateLastName("Thumu@ugoti");
        Assert.assertEquals(false, valid);
    }
    @Test
    public void lastName_withNumbers_shouldReturnFalse() {
        boolean valid=validation.validateLastName("Thumurugoti123");
        Assert.assertEquals(false, valid);
    }
}
