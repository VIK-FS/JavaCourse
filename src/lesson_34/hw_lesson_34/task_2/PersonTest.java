package lesson_34.hw_lesson_34.task_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPasswordValidation() {
         
        String[] validPasswords = {
                "Password123!",
                "Secure@2024",
                "Abc123!@#",
                "Test$Pass1"
        };

        for (String password : validPasswords) {
            Person person = new Person("user@example.com", password);
            assertEquals(password, person.getPassword(), "Пароль должен быть установлен: " + password);
        }

         
        String[] invalidPasswords = {
                "short1!",
                "nouppercase123!",
                "NOLOWERCASE123!",
                "NoDigits!!",
                "NoSpecialChar123"
        };

        for (String password : invalidPasswords) {
            Person person = new Person("user@example.com", password);
            assertNull(person.getPassword(), "Пароль не должен быть установлен: " + password);
        }
    }

    @Test
    public void testNullAndEmptyPasswords() {
        Person person1 = new Person("user@example.com", null);
        assertNull(person1.getPassword(), "Пароль не должен быть установлен (null)");

        Person person2 = new Person("user@example.com", "");
        assertNull(person2.getPassword(), "Пароль не должен быть установлен (пустая строка)");
    }
}

