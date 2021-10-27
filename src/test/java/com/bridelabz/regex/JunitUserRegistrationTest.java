package com.bridelabz.regex;

import com.bridgelabz.regex.JunitUserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    void givenPassWord_ReturnTrue() {
        boolean resutl = junitUserRegistration.password("anjAAira345342jfgdfg");
        Assertions.assertTrue(resutl);
    }
}
