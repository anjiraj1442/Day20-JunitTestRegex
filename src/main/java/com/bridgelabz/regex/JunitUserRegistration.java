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

    public boolean lastName(String lastName) {
       String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
