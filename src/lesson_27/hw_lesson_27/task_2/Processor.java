package lesson_27.hw_lesson_27.task_2;

class Processor extends Component {
    private double frequency;

    public Processor(String brand, String model, double frequency) {
        super(brand, model);
        this.frequency = frequency;
    }

    public String getInfo() {
        return "Процессор: " + super.getInfo() + ", " + frequency + " GHz";
    }
}

