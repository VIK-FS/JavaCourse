package lesson_24.hw_lesson_24.task_2;

import java.util.Random;

public class Dog {
    private String name;
    private int heightJump;
    private int startJump;
    private int maxHeightJump;
//    private int heightBarrier;

    static int numberOfDogs;

    public Dog(String name, int heightJump) {
        this.name = name;
        this.heightJump = heightJump;
        this.startJump = heightJump;
        this.maxHeightJump = heightJump * 2;
//        numberOfDogs++;
    }

    public String getName() {
        return name;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public int getMaxHeightJump() {
        return maxHeightJump;
    }

    public void jump() {
        System.out.println(name + " прыгает на " + heightJump + "см.");
    }

    //    public void training() {
//        if (heightJump + 10 <= maxHeightJump) {
//            heightJump += 10;
//            System.out.println(name + " натренировался! Теперь прыгаю на " + heightJump);
//        } else {
//            System.out.println(name + " достиг максимальной высоты тренировки!");
//        }
//    }
    public void training() {
        Random random = new Random();
        int increase = random.nextInt((10)+1);
        if (heightJump + increase <= maxHeightJump) {
            heightJump += increase;
            System.out.println(name + " натренировался! Теперь прыгаю на " + heightJump);
        } else {
            heightJump += increase;
//            heightJump = maxHeightJump; // Прямо устанавливаем на максимальную высоту, если дальше тренироваться нельзя.
            System.out.println(name + " достиг максимальной высоты тренировки " + (heightJump) + " см!");
        }
    }

    public void jumpBarrier(int heightBarrier) {
        // Если собака может перепрыгнуть барьер без тренировок
        if (heightJump >= heightBarrier) {
            System.out.println(name + " легко перепрыгнул барьер " + heightBarrier + " см!");
            return;
        }

        // Если максимальная высота прыжка собаки меньше барьера
        if (maxHeightJump < heightBarrier) {
            System.out.println(name + " никогда не сможет перепрыгнуть " + heightBarrier + " см!");
            return;
        }

        System.out.println(name + " пока не может перепрыгнуть " + heightBarrier + " см!");

        // Цикл тренировки до тех пор, пока собака не преодолеет барьер или не достигнет максимальной высоты
        while (heightJump < heightBarrier && heightJump < maxHeightJump) {
            training(); // тренировка
            // Если собака больше не может тренироваться (достигнута максимальная высота), выходим из цикла
            if (heightJump >= heightBarrier) {
                System.out.println(name + " теперь может перепрыгнуть " + heightBarrier + " см!");
                break;
            }
        }

        // Проверяем, может ли собака перепрыгнуть барьер после тренировки
//        if (heightJump >= heightBarrier) {
//            System.out.println(name + " теперь может перепрыгнуть " + heightBarrier + " см!");
//        } else {
//            System.out.println(name + " достиг максимальной высоты тренировки и всё равно не может перепрыгнуть!");
//        }
    }

}

//    public void jumpBarrier(int heightBarrier) {
//        if (heightJump >= heightBarrier) {
//            System.out.println(name + " легко перепрыгнул барьер " + heightBarrier + " см!");
//        } else if (maxHeightJump >= heightBarrier) {
//            System.out.println(name + " пока не может перепрыгнуть " + heightBarrier + " см!");
//            while (heightJump < heightBarrier /*&& heightJump < maxHeightJump*/) {
//                if (heightJump < maxHeightJump) {
//                    training();
//                } else {
//                    break;
//                }
//            }
//            if (heightJump >= heightBarrier) {
//                System.out.println(name + " теперь может перепрыгнуть " + heightBarrier + "см!");
//            } else {
//                System.out.println(name + " не может прыгнуть так высоко, даже с тренировками ");
//            }
//        } else {
//            System.out.println(name + " никогда не сможет перепрыгнуть " + heightBarrier + "см!");
//        }
//    }
