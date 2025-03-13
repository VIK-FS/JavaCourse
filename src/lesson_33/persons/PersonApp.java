package lesson_33.persons;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("test@mail.net", "Password-1");

        person.setEmail("test@mail.tz");

        System.out.println(person);

        person.setPassword("4");
        person.setPassword("lkss8798!");
        person.setPassword("lkSs8798!");
        System.out.println(person);
    }

}
