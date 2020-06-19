package com.registration;

import java.util.regex.Pattern;

public class Validation {

    public static final String FIRSTNAME_REGEX = "^[A-Z]{1}[A-za-z]{2,}$";
    public static final String LASTNAME_REGEX = "^[A-Z]{1}[A-za-z]{2,}$";

    public boolean validateFirstName(String firstName){
        Pattern pattern=Pattern.compile(FIRSTNAME_REGEX);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName){
        Pattern pattern=Pattern.compile(LASTNAME_REGEX);
        return pattern.matcher(lastName).matches();
    }
}