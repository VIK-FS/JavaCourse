package lesson_29.hw_lesson_29.task_2;

public abstract class GameCharacter {

    protected String type;
    //    protected String name;
    protected String weapon;
    protected int helth;
    protected int level;

    public GameCharacter(String type, String weapon, int health, int level) {
        this.type = type;
        this.weapon = weapon;
        this.helth = health;
        this.level = level;
    }

    public abstract void attack();

    public void showStats() {
        String stats = String.format("==Статы персонажа== Тип: %s. Оружие: %s. Здоровье: %d. Уровень: %d.\n"
                , type, weapon, helth, level);
        System.out.print(stats);
    }

}
