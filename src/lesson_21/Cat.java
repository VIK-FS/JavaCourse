package lesson_21;

public class Cat {
    //характеристики / состояние будущих объектов
    String name; // поле класса
    String color;
    int age;

    /*
    Конструктор класса
    Специальный тип метода, который автоматически вызывается
    при создании нового объекта (проинициализировать)

    Особенности конструктора:
    1. Имя совпадает с именем класса
    2. не имеет типа возвращаемого значения
    3. вызывается автоматически при создании объекта
     */

    // Конструктор по умолчанию
    public Cat() {
        //все поля получают значения по умолчанию
    }

    // Конструктор - это метод. И я могу передать значения в
    // тело метода
    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;

        // Ключевое слово this используется внутри класса
        //для ссылки на текущий объект
    }
    public Cat(String name, String color, int age){
        //ключевое слово this может быть использована для
        // ! или для передачи текущего объекта в качестве параметра метода
        // вызова других конст-ов класса
        this(name,color);// вызов другого конструктора класса ВСЕГДА должен быть первым
        //Вызов конструктора, принимающего две String-и
        //Сначала будет выполнен код соотв-го конст-ра

//        this.name = name;
//        this.color = color;
        this.age = age;
    }


    //поведение будущих объектов
    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, возраст: %d, мой окрас %s\n"
                , name, age, color);
    }

}
