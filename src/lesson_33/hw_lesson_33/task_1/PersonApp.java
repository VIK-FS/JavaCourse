package lesson_33.hw_lesson_33.task_1;

import lesson_33.persons.Person;

public class PersonApp {
    public static void main(String[] args) {
        lesson_33.persons.Person person = new Person("test@mail.net", "Password-1");

        person.setEmail("test@mail.tz");

        System.out.println(person);

        person.setPassword("4");
        person.setPassword("lkss8798!");
        person.setPassword("lkSs8798!");
        System.out.println(person);
    }

}
