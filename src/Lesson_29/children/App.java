package Lesson_29.children;

public class App {
    public static void main(String[] args) {
        Parent parent = new Parent("Parent");
        System.out.println(parent.name);

        Child child = new Child();
        System.out.println(child.name);
        System.out.println(child.age);

    }
}
