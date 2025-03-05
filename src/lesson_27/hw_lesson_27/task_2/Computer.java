package lesson_27.hw_lesson_27.task_2;

public class Computer {
    private final Processor processor;
    private final Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
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
