package lesson_30.hw_lesson_30.task_1;

public class TriathleteApp {
    public static void main(String[] args) {
        Triathlete[] triathletes = new Triathlete[2];
        triathletes[0] = new Triathlete("Бегун");
        triathletes[1] = new Triathlete("Плавец");

        for (int i = 0; i < triathletes.length; i++) {
            if (triathletes[i].sportsmen.equals("Бегун")) {
                triathletes[i].run();
            } else if (triathletes[i].sportsmen.equals("Плавец")) {
                triathletes[i].swim();
            }
        }
    }
}
