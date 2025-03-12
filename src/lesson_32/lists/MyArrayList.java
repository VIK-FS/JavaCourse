package lesson_32.lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int cursor; // по умолчанию = 0

    // методы, расширяющие функционал массива

    public MyArrayList() {
        // Стирание типов. невозможно создать объект типа T
        this.array = (T[]) new Object[10];
//        this.array = new int[10]; // [0,0...0]
    }

    public MyArrayList(T[] array) {
        // Todo Homework
//        this.array = Arrays.copyOf(array, array.length);
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            // (int...numbers) может принятт ссылку на массив
            addAll(array);
        }
    }

    // Добавление в массив одного элемента

    public void add(T value) {

        // Проверка! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место

        if (cursor == array.length) {
            // Расширить внутренний массив перед добавлением нового значения
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    //метод динамического расширения массива
    private void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор = " + cursor);
        /*
        System.out.println("Расширяем внутренний массив!" + (array.length * 2));
        array = Arrays.copyOf(array, array.length * 2);
         */
        /*
        1. Создать новый массив бОльшего размера ( в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */
//          Shift + Alt + стрелки вверх / вниз | Mac: Shift + Opt + Стрелка

        // 1

        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на "новый" массив
        array = newArray;
    }

    @Override
    // Добавление в массив несколько элементов
    public void addAll(T... numbers) {
        // c numbers я могу обращаться точно также как со ссылкой на массив int
//        System.out.println("Принял несколько int: " +numbers.length);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("У каждого инта есть индекс, как в массиве: "+ numbers[0]);

        // перебираю все значение. Для каждого вызываю метод add()

        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    @Override
    // Возвращает строковое представление массива
    // [5, 20, 45]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }
        return result;
    }

    @Override
    // 5. Текущее кол-во элементов в массиве
    public int size() {
        return cursor;
    }

    // 6. Возвращает значение по индексу
    public T get(int index) {
        // Проконтролировать входящий индекс
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        // Fixme Указать место в коде с ошибкой / проблемой
        //
        /// Код, если индекс не корректный
        // Хорошего решения нет
//        return -2_147_483_647;
        return null;
//        Todo Поправить обработку некорректного индекса
    }

    // переписать значенин по указаному индексу
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            // Если индекс корректный присваиваем новое значение
            array[index] = value;
        }
        // Если нет - действий не требуется
    }

    //    7. Удалить элемент по индексу (есть индекс - удалить элемент из массива)
//    Вернуть старое значение
    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
         */

        if (index >= 0 && index < cursor) {
            // логика удаления
            T value = array[index];

//          Перебираем элементы начиная с индекса и перезаписываем значением из ячейки справа
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов
                array[i] = array[i + 1];
            }
            cursor--;
            array[cursor] = null; // Очищаем ссылку на последний элемент
            return value;

        } else {
            //Индекс не валидный
            // Todo Поправить возвращаемое значение
//            return -2_147_483_647;
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    //9. Поиск по значению
    // {1, 100, 5, 24, 0, 5} -> indexOf(5) = 2; indexOf(50) = -1;
    public int indexOf(T value) {
        // Перебераю все значимые элементы
        // Если эл. равен искомому- вернуть индекс такого эл.
        // Если перебрал все элементы =- не нашел совпадений - вернуть -1

        for (int i = 0; i < cursor; i++) {
            if (Objects.equals(array[i], value)) return i;
            // TODO null-безопасное сравнение
//            if (array[i].equals(value)) {
//                // Значения совпали. Возвращаю индекс
//                return i;
//            }
        }
        // Сюда мы попадем, если ни одно значение в массиве не совпало
        return -1;
    }

    // Индекс последнего вхождения (поиск)
    // {1,100,5,100,24,0,100} -> lastIndexOf(100) -> 6
    public int lastIndexOf(T value) {
        // Todo Homework
        for (int i = cursor - 1; i >= 0; i--) {
            if (Objects.equals(array[i], value)) return i;
//            if (array[i].equals(value)) {
//                // Значения совпали. Возвращаю индекс
//                return i;
//            }
        }
        return -1;
    /*
    int index = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                // Значения совпали, обновляю переменную index
                index = i;
            }
        }
        return index;
     */
    }

    //    // удаления всех элементов по значению
//    boolean removeByValue(int value) {
//        boolean found = false;
//
//        for (int i = 0; i < cursor; i++) {
//            if (array[i] == value) {
//
//                for (int j = i; j < cursor - 1; j++) {
//                    array[j] = array[j + 1];
//                }
//                cursor--;
//                i--; // Корректировка индекса, чтобы не пропустить следующий элемент
//                found = true;
//            }
//        }
//
//        return found;
//    }
    // Удаление элемента по значению
//    boolean removeByValue(int value) {
//        // Todo Homework
//
//        int index = lastIndexOf(value);
//        if (index == -1) return false;
//
//        for (int i = index; i < cursor - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        cursor--;
//        return true;
//    }

    @Override
    // Удаление элемента по значению
    public boolean remove(T value) {
        // Todo Homework
        /*
        1. Есть ли элемент с  таким значением - indexOf
        2. Если элемента нет - ничего не пытаемся удалить - возвращаем false
        3. Если найден - удалить и затем вернуть true.
         */

        int index = indexOf(value);
        if (index < 0) return false;

        remove(index);
        return true;
    }


    // {1, 100, 5, 100, 24, 0, 100}
    public Integer[] findAllValues(T value) {
        int count = 0;

        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                count++;
            }
        }

        if (count == 0) {
            return new Integer[0];
        }

        Integer[] indexes = new Integer[count];
        int indexCounter = 0;
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                indexes[indexCounter++] = i;
//                  indexCounter++;
            }
        }

        return indexes;
    }

    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    //    // Массив, состоящий из элементов магического массива
    public T[] toArray() {
        /*
        1. Создать массив cursor (количество значимых эл-в)
        2. Пройтись по внутреннему массиву
        3. Вернуть ссылку на новый массив
         */

        // TODO здесь будет ошибка
//    T[] result = (T[]) new Object[cursor];
//    T[] res = new T[11];
//    T obj = new T();

        // Взять какой-то объект из моего массива
        // и узнать с помощью рефлексии тип этого объекта
        // Потом я могу создать массив этого типа
        if (cursor == 0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

        // Создаю массив того же типа, что и 0-й элемент.
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }


//    public int[] toArray() {
//        int[] result = new int[cursor];
//        for (int i = 0; i < cursor; i++) {
//            result[i] = array[i];
//        }
//        return result;
//    }

    public void test() {
        System.out.println(Arrays.toString(array));
    }
}

/*
1. Добавлять в массив элемент (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера внутреннего массива ++
3. Возвратить строковое представление массива (все элементы массива в одной строке) (какие элементы есть)++
4. Добавить в массив сразу несколько значений ++
5. Текущее кол-во элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удалить элемент по индексу (есть индекс - удалить элемент из массива). Возвращает старое значение ++
8. Удаление элемента по значению. Возвращал boolean. Если удалил - вернет true. Не нашел что удалять - false
9. Поиск по значению. Возвращать индекс первого вхождения элемента ++
10. Индекс последнего вхождения.
11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива
12.Написать метод, который вернет массив, состоящий из элементов магического массива
 */