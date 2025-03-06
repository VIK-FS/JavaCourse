/*
Статический полиформизм (Overload)
динамический полиформизм (Override)

Перерпределение методов происходит, когда наследник продоставляет специфическую реализацию


 */
package lesson_28.animals;

public class Animal {
    public void voice(){
        System.out.println("Animal say something");
    }
    @Override
    public String toString(){
        return "Animal toString!";
    }


}
