package com.bridelabz.regex;

import com.bridgelabz.regex.JunitUserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {

    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Ramakrishna");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("RamaKrishna");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.lastName("Velisetti");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.lastName("veliseTTi");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.emailId("ramakrishna96.velisetti@gmail.com");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.emailId("ramakrishna96.velisettigmail.com");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.mobileNumber("91 9989774456");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.mobileNumber("919989774456");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule1("qwgthjkdl");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule1("jnsdsjRcvc");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule2("qwgthRLjkdl");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule2("jnsdjcvcp");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule3("qw98hRLkdl");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule3("jnsdjcvcp");
        Assertions.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule4("qw98hRL@&dl");
        Assertions.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule4("jsdjcvcp");
        Assertions.assertEquals(false, actualResult);
    }
}
