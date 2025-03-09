package lesson_28.animals;

public class Dog extends Animal {

    @Override
    public void voice(){

        super.voice();// default
    }
    @Override
    public String toString(){
        return super.toString()+ "| Dog дополнительная реализация";
    }

    public void bark(){
        System.out.println("Dog bark");
    }
}
