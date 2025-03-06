package lesson_24.hw_lesson_24.task_2;

public class DogApps {
    public static void main(String[] args) {

        Dog[] dogs = {
                new Dog("Рекс", 22),
                new Dog("Пират", 15),
                new Dog("Оскар", 18),
                new Dog("Ириска", 25),
                new Dog("Бейли", 32)
        };

        int[] barriers = {22, 40, 32, 50, 60};

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].jumpBarrier(barriers[i]);
        }

//        System.out.println("\nИнформация о собаках:");
//        for (int i = 0; i < dogs.length; i++) {
//            System.out.printf("Имя: %-7s | Прыжок: %-2d см | Макс. прыжок: %-2d см\n",
//                    dogs[i].getName(), dogs[i].getHeightJump(), dogs[i].getMaxHeightJump());
//        }
    }
}
