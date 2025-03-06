package lesson_28.hw_lesson_28.task_0;

public class Dog extends Animal {

    @Override
    public void voice(){

        super.voice();// default
    }
    @Override
    public String toString(){
        return super.toString()+ "| Dog дополнительная реализация";
    }
}
