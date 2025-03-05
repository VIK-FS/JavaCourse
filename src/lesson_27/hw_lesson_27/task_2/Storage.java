package lesson_27.hw_lesson_27.task_2;

class Storage extends Component {
    private int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String getInfo() {
        return "Накопитель: " + super.getInfo() + ", " + capacity + " GB";
    }
}
