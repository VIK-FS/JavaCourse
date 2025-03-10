package lesson_29;

/*
Объекты могут пренадлежать классу X и при этом могут быть приведены к другому типу, если между классами есть связь
наследования.
Это называестся кастингом (casting)

Кастинг бывает двух видов:

-	Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
-	Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса.
 */

import lesson_28.animals.Animal;
import lesson_28.animals.Cat;
import lesson_28.animals.Dog;
import lesson_28.animals.Hamster;

public class CastingExample2 {
    public static void main(String[] args) {

        // Восходящее и нисходящее преобразование
        //

        Animal animal = new Cat();
        Animal cat = new Cat();
//        Animal dog = new Dog();


        /*
        !!! ВажноЁ!
        Тип ссылочной переменной определяет:
        1. Ссылки на объекты каких типов могут храниться в этой переменной
        2. Список методов, который можно вызвать, обращаясь к этой переменной
         */

        // Ссылочная переменная может хранить объект своего класса или любого ребенка

        // какая реализация будет вызвана - определяется типом объекта
        animal.voice();
        Animal animal1 = new Hamster(); // Неявное авто преобразование
        animal1.voice();
        Animal[] animals = new  Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        Object obj = new Cat();

        // TODO Нисходящее преобразование
        System.out.println("\n=====================");

        int intX = 10;
        double doubleX = intX;
        System.out.println(doubleX);

        intX = (int) doubleX;

        Animal animalD = new Dog();
        Dog dog = (Dog) animalD;

        dog.bark();

        Animal animalCat = new Cat();

        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();

            if (currentAnimal instanceof  Cat){
                System.out.println(currentAnimal + " -> is a Cat typ");
                Cat catLink =(Cat) currentAnimal;
                catLink.eat();
            }

            if (currentAnimal instanceof Dog){
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark();
            }

            System.out.println("===================");

        }


    }
}
