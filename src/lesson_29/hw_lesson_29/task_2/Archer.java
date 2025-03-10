package lesson_29.hw_lesson_29.task_2;

public class Archer extends GameCharacter {

    public Archer(String type) {
        super(type, "лук", 80, 10);
    }

    @Override
    public void attack() {
        System.out.printf("%s атакует, используя %s.\n", type, weapon);
    }
}
