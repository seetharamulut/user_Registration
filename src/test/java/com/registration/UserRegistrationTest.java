package com.registration;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UserRegistrationTest {
    Validation validation = new Validation();

    @Test
    public void properFirstName_shouldReturnTrue() {
        boolean valid = validation.validateFirstName("Kalyan");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void firstName_noUppercase_shouldReturnFalse() {
        boolean valid = validation.validateFirstName("kalyan");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void firstName_improperLength_shouldReturnFalse() {
        boolean valid = validation.validateFirstName("Ka");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void firstName_withSpecialCharacters_shouldReturnFalse() {
        boolean valid = validation.validateFirstName("kalyan@");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void firstName_withNumbers_shouldReturnFalse() {
        boolean valid = validation.validateFirstName("kalyan123");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void properLastName_shouldReturnTrue() {
        boolean valid = validation.validateLastName("Thumurugoti");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void lastName_noUppercase_shouldReturnFalse() {
        boolean valid = validation.validateLastName("thumurugoti");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void lastName_improperLength_shouldReturnFalse() {
        boolean valid = validation.validateLastName("Th");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void lastName_withSpecialCharacters_shouldReturnFalse() {
        boolean valid = validation.validateLastName("Thumu@ugoti");
        Assert.assertEquals(false, valid);
    }

    @Test
    public void lastName_withNumbers_shouldReturnFalse() {
        boolean valid = validation.validateLastName("Thumurugoti123");
        Assert.assertEquals(false, valid);
    }

    @RunWith(Parameterized.class)
    public class emailValidationTest {
        public String emailId;
        public boolean validationExpected;
        public Validation.validateEmail validateEmail;

        public void emailValidationTest(String emialId, boolean validationExpected) {
            this.emailId = emialId;
            this.validationExpected = validationExpected;
        }

        @BeforeClass
        public void initalize() {
            validateEmail = new Validation.validateEmail();
        }

        @Parameterized.Parameters
        public Collection input() {
            Object[][] input = new Object[][]
                    {
                            {"abc@yahoo.com", true},
                            {"abc-100@yahoo.com", true},
                            {"abc.100@yahoo.com", true},
                            {"abc111@abc.com", true},
                            {"abc-100@abc.net", true},
                            {"abc.100@abc.com.au", true},
                            {"abc@1.com", true},
                            {"abc@gmail.com.com", true},
                            {"abc+100@gmail.com", true},


                            {"abc", false},
                            {"abc@.com.my", false},
                            {"abc123@gmail.a", false},
                            {"abc123@.com", false},
                            {"abc123@.com.com", false},
                            {".abc@abc.com", false},
                            {"abc()*@gmail.com", false},
                            {"abc@%*.com", false},
                            {"abc..2002@gmail.com", false},
                            {"abc.@gmail.com", false},
                            {"abc@abc@gmail.com", false},
                            {"abc@gmail.com.1a", false},
                            {"abc@gmail.com.aa.au", false}
                    };
            return Arrays.asList(input);
        }

        @Test
        public void testEmailId() {
            boolean valid = validateEmail.validate(this.emailId);
            Assert.assertEquals(this.validationExpected, valid);
        }
    }
}
