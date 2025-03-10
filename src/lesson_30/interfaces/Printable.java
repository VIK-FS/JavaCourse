package lesson_30.interfaces;

// Интерфейс содержит только поведение, которое
public interface Printable {
    // Интерфейс - это совокупность абстрактных методов, задающих поведение

    // Все методы интерфейса косвенно (неявно по умолчанию) и абстрактные, и публичные
    // Интерфейс косвенно абстрактный. Ключевое слово abstract

    // Могут быть константы (public static final)
    public static final String color = "block";
//    public abstract
//    public abstract void print();
    void print();

    // начиная с JDK 8 доступны методы по умолчанию
    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void testStaticMethod(String str){
        System.out.println("Static method " + str);
    }

    // c JDK 9 появились приватные методы (могут быть статические и нестатические)
    // Переопределить в классе НЕВОЗМОЖНО
}
