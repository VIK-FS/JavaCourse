package lesson_29.hw_lesson_29.task_2;

public class Warrior extends GameCharacter {

    public Warrior(String type) {
        super(type, "меч", 100, 1);
    }

    @Override
    public void attack() {
        System.out.printf("%s атакует, используя %s.\n", type, weapon);
    }
}

