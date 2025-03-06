package lesson_28.hw_lesson_28.task_1;

public class Human {
    private int speed;
    private int timeOfRest;

    public Human(int speed, int timeOfRest) {
        this.speed = speed;
        this.timeOfRest = timeOfRest;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTimeOfRest() {
        return timeOfRest;
    }

    public void run(){
        System.out.printf("Обычный человек бежит со скоростью %d км/ч.\n", speed);
        rest();
    }

    public void rest(){
        System.out.printf("Обычному человеку нужен отдых после пробежки %d минут.\n", timeOfRest);
    }
}
