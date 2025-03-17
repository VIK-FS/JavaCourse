package lesson_34.hw_lesson_34.task_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
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

    @Test
    public void testValidPasswords() {
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
    }

    @Test
    public void testInvalidPasswords() {
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
