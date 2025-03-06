package lesson_28.animals;

public class Cat extends Animal{

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
