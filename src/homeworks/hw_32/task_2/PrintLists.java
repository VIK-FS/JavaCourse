package homeworks.hw_32.task_2;

import lesson_32.lists.MyArrayList;
import lesson_32.lists.MyList;

public class PrintLists {
    public static <T,U> void printTwoLists(MyList<T> list1, MyList<U> list2){
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }

    public static void main(String[] args) {

    }

}
