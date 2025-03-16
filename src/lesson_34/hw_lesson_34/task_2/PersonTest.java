package lesson_34.hw_lesson_34.task_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class PersonTest {

    static Stream<String> validPasswords() {
        return Stream.of(
                "Password123!",
                "Secure@2024",
                "Abc123!@#",
                "Test$Pass1"
        );
    }

    static Stream<String> invalidPasswords() {
        return Stream.of(
                "short1!",
                "nouppercase123!",
                "NOLOWERCASE123!",
                "NoDigits!!",
                "NoSpecialChar123"
        );
    }

    @ParameterizedTest
    @MethodSource("validPasswords")
    public void testValidPasswords(String password) {
        Person person = new Person("user@example.com", password);
        assertEquals(password, person.getPassword(), "Пароль должен быть установлен: " + password);
    }

    @ParameterizedTest
    @MethodSource("invalidPasswords")
    public void testInvalidPasswords(String password) {
        Person person = new Person("user@example.com", password);
        assertNull(person.getPassword(), "Пароль не должен быть установлен: " + password);
    }
}
