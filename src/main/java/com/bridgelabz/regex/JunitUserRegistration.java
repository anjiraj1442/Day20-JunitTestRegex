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

    public boolean emailId(String emailIds) {
       String regex = "^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailIds);
        return matcher.matches();
    }
}
