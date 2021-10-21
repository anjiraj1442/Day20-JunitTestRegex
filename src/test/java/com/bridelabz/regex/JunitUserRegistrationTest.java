package com.bridelabz.regex;

import com.bridgelabz.regex.JunitUserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    void givenEmailId_ReturnTrue() {
        boolean resutl = junitUserRegistration.emailId("anjirajardula@gmail.com");
        Assertions.assertTrue(resutl);
    }
}
