package lesson_29.children;

public class Child extends Parent {
    // private String name;
    int age;

    // Если нет ни одного

    public Child() {
        //снача я ДОЛЖЕН создать объект родителя
//       super(); // Если я не вызвал конструктор родителя, будет добавлен
        super("Default");
        this.age = 20;
    }

    public Child(String name, int age) {

        super(name);
        this.name = name;
        this.age = age;
    }

    // я не могу переопределить final-метод  в наследнике
//    @Override
//    void show() {
//        System.out.println("Another show");
//    }


//    public Child() {
//        super();
//    }
}
