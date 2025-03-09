package Lesson_29.hw_lesson_29.task_2;

public class Mage extends GameCharacter {

    public Mage(String type) {
        super(type, "посох", 60, 5);
    }

    @Override
    public void attack() {
        System.out.printf("%s атакует, используя %s.\n", type, weapon);
    }
}
