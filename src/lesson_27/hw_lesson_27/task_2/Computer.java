package lesson_27.hw_lesson_27.task_2;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private Storage storage;

    public Computer(Storage storage) {
        this.processor = new Processor("Atom", "A1250", 4.5);
        this.memory = new Memory("Hynix", "HNX",8);
        this.storage = storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void showSpecs() {
        System.out.println(processor.getInfo());
        System.out.println(memory.getInfo());
        System.out.println(storage.getInfo());
    }
}
