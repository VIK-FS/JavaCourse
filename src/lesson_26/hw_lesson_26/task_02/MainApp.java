/*
Task 2
Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас
и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
 */
package lesson_26.hw_lesson_26.task_02;

public class MainApp {
    public static void main(String[] args) {
        HalogenLamp halogenLamp = new HalogenLamp("Галогеновая лампа", "Желтый", 3000);
        halogenLamp.setColorLight("Светло-желтый");
        halogenLamp.setValues(220, 0.5, 25);
        halogenLamp.displayInfo();
        halogenLamp.displayPower();
        halogenLamp.displayLuminousEfficacy();
        halogenLamp.displayTemperature();
        System.out.println(halogenLamp.toString());

        System.out.println("================================================================================");

        LedLamp ledLamp = new LedLamp("LED-лампа", "Дневной", "Холодный белый");
        ledLamp.setColorLight("Белый");
        ledLamp.setValues(220, 0.01, 150);
        ledLamp.displayInfo();
        ledLamp.displayPower();
        ledLamp.displayLuminousEfficacy();
        ledLamp.displayColorTemperature();
        System.out.println(ledLamp.toString());
    }
}

