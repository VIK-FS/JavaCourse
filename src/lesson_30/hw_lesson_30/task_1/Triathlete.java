package lesson_30.hw_lesson_30.task_1;

public class Triathlete implements Swimmer, Runner {
    protected String sportsmen;

    public Triathlete(String sportsmen) {
        this.sportsmen = sportsmen;
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", sportsmen);
    }

    @Override
    public void swim() {
        System.out.printf("%s плывёт\n",sportsmen);
    }
}
