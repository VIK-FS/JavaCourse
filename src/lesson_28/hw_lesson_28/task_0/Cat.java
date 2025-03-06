package lesson_28.hw_lesson_28.task_0;

public class Cat extends Animal {

    //
    public void eat(){
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()
    @Override
    public void voice(){
        System.out.println("Cat say Meow!");
    }

}
