package lesson_33;

import lesson_32.lists.MyArrayList;
import lesson_32.lists.MyList;

import java.util.Arrays;
import java.util.Iterator;

/*
Есть два интерфейса Iterabte и Iterator
1.	Iterable<T> - означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
Один абстрактный метод: Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции) •
2.	Iterator<T> - собственно итератор, который позволяет обходить коллекцию.|
-   boolean hasNext() - есть ли следующий элемент
-	Т next() - возвращает следующий элемент
-	void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)

*/
public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
//            iterator.remove();// без переопределения метода выдает ошибку
        }
        // цикл for-each

        // при переборе циклом for-each не рекомендуется изменять коллекцию (добавлять / удалять)
        /*
        for (Тип переменной имя переменнной : коллекция){
            действие с переменной
        }
         */
        System.out.println("\n================================");

        for (String strCurrent: list){
            System.out.println(strCurrent);

        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3,4,5,6);

        // Вывести в консоль все числа которые есть в списке умноженое на 2
        // for each

        for (Integer value : integers) {
            System.out.println(value * 2);

        }

        //
        for (int i = 0; i < integers.size(); i++) {
            Integer value = integers.get(i);
        }

        int[] array = {10,20,30,40,50};


        for (int element : array){
            System.out.println(element);
        }



    }

}
