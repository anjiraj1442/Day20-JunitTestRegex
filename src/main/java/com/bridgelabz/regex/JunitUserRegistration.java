package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * J unit User Registration
 *
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since :21/10/2021
 *
 */

public class JunitUserRegistration {

    public boolean mobileNumber(String mobileNumber) {
       String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
}
