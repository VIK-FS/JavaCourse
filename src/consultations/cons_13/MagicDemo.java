package consultations.cons_13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Alex");

// Нахожу приватное поле name
        Field nameField = Person.class.getDeclaredField("name");

// Открываю доступ к приватному полю nameField.setAccessible(true);
// Меняю значение в поле nameField.set(person, "Мария");
// проверяем, сработало ли System.out.println("3Ha4eHne в поле name: " + nameField.get(person));
// Закрываем поле
        nameField.setAccessible(true);

        nameField.set(person, "Мария");
        System.out.println("Значение в поле name: " + nameField.get(person));
// Нахожу метод по имени
        nameField.setAccessible(false);

        System.out.println(person);

        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        sayHelloMethod.setAccessible(true);

        sayHelloMethod.invoke(person);

        sayHelloMethod.setAccessible(false);

        System.out.println("\n========================");

        Class<?> personClass = Class.forName("consultations.cons_13.Person");

        Constructor<?> constructor = personClass.getConstructor(String.class);
        Person object = (Person) constructor.newInstance("Сергей");
        System.out.println(object);

        sayHelloMethod.setAccessible(true);

        sayHelloMethod.invoke(object);

        sayHelloMethod.setAccessible(false);
    }
}