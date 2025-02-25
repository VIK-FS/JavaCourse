package lesson_21;

public class MainCats {
    public static void main(String[] args) {
        //
        Cat cat = new Cat(); // Создание нового объекта класса Cat
        // 1. Физически в памяти создается объект типа Cat
        // 2. Вызывается конструктор класса
        // 3.
        //
        /*
        При создании объекта все его поля инициализируются какими-то значениями
        По умолчанию поля инициализируются значениями для своего типа данных
        числовые - 0-0.0;

         */

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        System.out.println("Возраст: " + cat.age);

        System.out.println("=======================");

        Cat cat1 = new Cat("Max");

        //
        System.out.println("cat1.name: " + cat1.name);
        System.out.println("cat1.color: " + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("========================");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " +barsik.name);
        System.out.println("barsik.color: " +barsik.color);
        System.out.println("barsik.age: " +barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;

        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("\nbarsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("=================================");

        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // null ничто. Ссылка не ссылается ни на какой объект
        // Error NPE - NullPointerException

//        catClone.age = 44;
//        catClone.whoAmI();

        if (catClone != null){
            System.out.println(catClone.name);
            catClone.whoAmI();
        }else {
            System.out.println("В переменной хранится null");
        }



    }
}
