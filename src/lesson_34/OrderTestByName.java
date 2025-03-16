package lesson_34;

// Тесты будут выполняться по алфавитному порядку

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderTestByName {


    @Test
    void testB(){
        System.out.println("testB");
    }
    @Test
    void testA(){
        System.out.println("testA");
    }
    @Test
    void testZ(){
        System.out.println("testZ");
    }
    @Test
    void testL(){
        System.out.println("testL");
    }

}
