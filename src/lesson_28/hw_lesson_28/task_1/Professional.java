package lesson_28.hw_lesson_28.task_1;

public class Professional extends Human {

    public Professional(int speed, int timeOfRest) {
        super(speed, timeOfRest);
    }

//    @Override
    public void run(){
        System.out.printf("Профессионал бежит со скоростью %d км/ч.\n", getSpeed());
        rest();
    }
//    @Override
    public void rest(){
        System.out.printf("Профессионалу нужен отдых после пробежки %d минут\n", getTimeOfRest());
    }


}
