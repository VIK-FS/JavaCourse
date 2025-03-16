package lesson_34.hw_lesson_34.task_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "user@@domain.com",
            "user@domaincom",
            "@domain.com",
            "user@.com",
            "user@domain.c",
            "user@domain,com",
            "user@ domain.com",
//            "1user@domain.com",
            "user@domain..com",
            "user@.domain.com",
            "user@domain.",
            "userdomain.com",
            "user@domain_com",
            "user@do main.com",
            "user@domain.com.",
            "user@-domain.com",
            "user@domain.com-"
    })
    public void testInvalidEmails(String email) {

        Person person = new Person(email, "Password123!");
        assertNull(person.getEmail(), "Email должен быть невалидным: " + email);
    }
}