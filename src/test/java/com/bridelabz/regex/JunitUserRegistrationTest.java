package com.bridelabz.regex;

import com.bridgelabz.regex.JunitUserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    void givenMobileNumber_ReturnTrue() {
        boolean resutl = junitUserRegistration.mobileNumber("91 8333877108");
        Assertions.assertTrue(resutl);
    }
}
