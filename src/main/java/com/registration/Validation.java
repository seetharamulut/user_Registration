package com.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static final String FIRSTNAME_REGEX = "^[A-Z]{1}[A-za-z]{2,}$";
    public static final String LASTNAME_REGEX = "^[A-Z]{1}[A-za-z]{2,}$";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9]+[._+-][0-9a-zA-Z]+@[a-z]{1,}+.[a-z]{1,4}([.][a-z]{1,})*$";
    public static final String MOBILENUMBER_REGEX = "^[9,1]{1,2}[' '][0-9]{10}";

    public boolean validateFirstName(String firstName){
        Pattern pattern=Pattern.compile(FIRSTNAME_REGEX);
        return pattern.matcher(firstName).matches();
    }
    public boolean validateLastName(String lastName){
        Pattern pattern=Pattern.compile(LASTNAME_REGEX);
        return pattern.matcher(lastName).matches();
    }
    public static class validateEmail {
        private Pattern pattern;
        private Matcher matcher;

        public void validateEmail() {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
        }
        public boolean validate (String email) {
            return pattern.matcher(email).matches();
        }
    }
    public boolean validateMobileNumber(String mobileNumber){
        Pattern pattern=Pattern.compile(MOBILENUMBER_REGEX);
        return pattern.matcher(mobileNumber).matches();
    }
}
