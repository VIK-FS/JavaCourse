package lesson_29.abstracts;

/*
Абстактрные классы - позволяют определить шаблон для группы связанных классов.

1.
 */
public abstract class Animal {

    private String name;

    public Animal(){
        this.name = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    // Абстрактный метод не имеет реализации (тело метода)
    abstract void move();
    abstract void eat();

    public void sayHello(){
        System.out.println("Hello from animal");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
