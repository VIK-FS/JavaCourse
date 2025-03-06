package homeworks.hw_27.components;


public class Computer {
    private String model;
    private Process process;
    private Memory memory;
    private Storage storage;

    public Computer(String model, Storage storage) {
        this.model = model;
        this.storage = storage;
//        this.processor = new Processor("AMD", "AMD-01");
        this.memory = new Memory("Samsung", "M-02", 32);
    }

    public Computer(String model, Storage storage, int memoryCapacity) {
        this.model = model;
        this.storage = storage;
//        this.processor = new Processor("AMD", "AMD-01");
        this.memory = new Memory("Samsung", "M-02", 32);
    }

//    public String toString(){
////        return  String.format("Computer: {model: %s, processor: %s, memory: %d, storage: %s }"
////        , );
//    }
}
