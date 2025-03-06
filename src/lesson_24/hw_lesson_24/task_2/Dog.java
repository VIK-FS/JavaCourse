package lesson_24.hw_lesson_24.task_2;

import java.util.Random;

public class Dog {
    private String name;
    private int heightJump;
    private int startJump;
    private int maxHeightJump;

    public Dog(String name, int heightJump) {
        this.name = name;
        this.heightJump = heightJump;
        this.startJump = heightJump;
        this.maxHeightJump = heightJump * 2;
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

    public void training() {
        Random random = new Random();
        int increase = random.nextInt((10) + 1);
        if (heightJump + increase <= maxHeightJump) {
            heightJump += increase;
            System.out.println(name + " натренировался! Теперь прыгаю на " + heightJump);
        } else {
            heightJump += increase;
            System.out.println(name + " достиг максимальной высоты тренировки " + (heightJump) + " см!");
        }
    }

    public void jumpBarrier(int heightBarrier) {
        if (heightJump >= heightBarrier) {
            jump();
            System.out.println(name + " легко перепрыгнул барьер " + heightBarrier + " см!");
            return;
        }

        if (maxHeightJump < heightBarrier) {
            System.out.println(name + " никогда не сможет перепрыгнуть " + heightBarrier + " см!");
            return;
        }

        System.out.println(name + " пока не может перепрыгнуть " + heightBarrier + " см!");

        while (heightJump < heightBarrier && heightJump < maxHeightJump) {
            training();
            if (heightJump >= heightBarrier) {
                System.out.println(name + " теперь может перепрыгнуть " + heightBarrier + " см!");
                break;
            }
        }
    }
}

