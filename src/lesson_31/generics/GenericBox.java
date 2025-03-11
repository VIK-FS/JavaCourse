package lesson_31.generics;
/*
Мы создаем универсальный класс. И не указываем тип данных с которым работаем
Мы хотим определить


 */

public class GenericBox <T>{// T- type, E - element, K - key,V - value ,
    // <T>  - означает что вместо Т будет подставлен конкретный тип данных
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
