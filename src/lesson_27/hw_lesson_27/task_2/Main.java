package lesson_27.hw_lesson_27.task_2;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Итнел", "i7-12700K", 3.6);
        Memory memory = new Memory("Корсар", "Vengeance", 16);
        Storage storage = new Storage("Самсунг", "EVO 970", 1000);

        Computer computer = new Computer(processor, memory, storage);
        computer.showSpecs();

        computer.setStorage(new Storage("WD", "Blue", 2000));

        System.out.println("\nПосле смены накопителя: ");
        computer.showSpecs();
    }
}
