package lesson_28.animals;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.voice();// от Animal
        System.out.println(cat.toString());

        cat.eat(); // метод класса Cat

        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("============================");

        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        System.out.println("============================");

        Object object = new Object();

    }
}
