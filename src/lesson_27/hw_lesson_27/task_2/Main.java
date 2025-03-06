package lesson_27.hw_lesson_27.task_2;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("Самсунг", "EVO 970", 1000);

        Computer computer = new Computer(storage);
        computer.showSpecs();

        computer.setStorage(new Storage("WD", "Blue", 2000));

        System.out.println("\nПосле смены накопителя: ");
        computer.showSpecs();
    }
}
