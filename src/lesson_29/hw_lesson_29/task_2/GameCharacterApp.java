package lesson_29.hw_lesson_29.task_2;

public class GameCharacterApp {
    public static void main(String[] args) {
        GameCharacter[] gameCharacters = {
                new Warrior("воин"),
                new Mage("маг"),
                new Archer("лучник")
        };

        for (int i = 0; i < gameCharacters.length; i++) {
            gameCharacters[i].attack();
            gameCharacters[i].showStats();
            System.out.println();

        }

    }
}
