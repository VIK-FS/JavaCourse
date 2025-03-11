package homeworks.hw_30.task_1;

public class Triathlete implements Swimmer,Runner{
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    @Override
    public void run() {

    }

    @Override
    public void swimm() {

    }
}
