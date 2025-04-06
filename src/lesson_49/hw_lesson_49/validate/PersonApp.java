package lesson_49.hw_lesson_49.validate;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");
        Person person1 = new Person("john.gmail.com", "Qwerty@1");
        Person person2 = new Person("john@gm.com", "qwerty41");
        Person person3 = new Person("john.@gmail.com", "Qwerty11");
        Person person4 = new Person("@john.gmail.com", "Qwertysd");
        Person person5 = new Person("+john@gmail.com", "awerty@1");
    }
}
