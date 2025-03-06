package homeworks.hw_27.components;

public class Memory extends  Component{
    private int size;

    public Memory(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
