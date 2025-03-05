package lesson_27.hw_lesson_27.task_2;

class Memory extends Component {
    private int capacity;

    public Memory(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String getInfo() {
        return "Память: " + super.getInfo() + ", " + capacity + " GB";
    }
}
