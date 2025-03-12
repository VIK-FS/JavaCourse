package lesson_31.lists;

public class TypeErasure <E>{
    private Object value;

    public TypeErasure(Object value) {
        this.value = value;
    }

    public Integer getValue() {
        return (Integer) value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    // нельзя создавать перегруженный  метод
    public void method(TypeErasure<Integer> typeErasure){
        System.out.println(typeErasure);
    }




    public static void main(String[] args) {
        TypeErasure<Integer> t = new TypeErasure<>(5);
    }
}
