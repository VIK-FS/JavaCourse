package lesson_34.persons;

import lesson_25.hw_lesson_25.task_01.Calculator;
import lesson_27.hw_lesson_27.task_3.Autobus;
import lesson_27.hw_lesson_27.task_3.BusDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // метод, который выполняется перед каждым местовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Method @BeforeEach");

    }
    /*
    @BeforeAll- метод выполняется один раз перед выполнением первого теста
    @AfterEach -метод, который выполняется каждого тестового метода
    @AfterAll - метод выполняется один раз после выполнением всех тестовых методов
    @Disable -
     */

    // @Test - Указывает что метод является тестовым
    // таким образом JUnit  знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test additions");
        double result = Calculator.addition(2, 3);

        // Реальное / фактическое значение в переменной result
        // Ожидаемое значение - 5

        // Методы проверки утверждений
        //assertEquals(expected, result)
        assertEquals(5, result); // проверяет равны ли два значения. Тест будет пройден, если 2 значения равны
        Assertions.assertNotEquals(0, result); // Тест будет пройден, если фактический результат не совпадет с неожидаемым результатом
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно
        assertEquals(10, 5 + 5); // статический импорт
        assertFalse(result > 10); // проверяет , что условие ложно
        assertNull(null); // проверяет что объект null
        assertNotNull("String");// проверяет что объект не null
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        // Если в методе нет ложного утверждения, он считается пройденным
        // В том числе путой (вообще без утверждений) считается пройденным

    }

    //параметризованные тесты
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);

    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void testStatic(int value) {
        Autobus bus = new Autobus(new BusDriver("Test", "11111"), 10);
        System.out.println(bus);
    }

    // Источник данных в формате CSV -
    // Источник данных  файл в формате CSV -

    // источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruit(String fruit) {
        System.out.println("current value: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits() {
        return Stream.of("apple", "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSoursArgument(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value + value;
        assertEquals(expected, result);
    }

    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 16, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testPersonData(Person person, String newEmail) {
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);
    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@email.com", "passddwW1%");
        return Stream.of(
                Arguments.of(person, "new1234#mail.com"),
                Arguments.of(new Person("invalid.ail.com", "password"), "pass.com")
        );
    }
}
