package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * J unit User Registration
 *
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since :28/10/2021
 *
 */

public class JunitUserRegistration {

    public boolean password(String password) {
       String regex = "^[a-z](?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
