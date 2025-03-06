package lesson_28.animals;

public class TestToString {
    private String title;

    public TestToString(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass: " + title;
    }

    public static void main(String[] args) {
        TestToString test = new TestToString("Test");
/*
        //У всех классов есть родитель Object
        -> у объекта любого класса есть мотод toString (полученный от Object
        -> sout  или конкатенация String + ссылка)


 */
        System.out.println(test.toString());

        String result = "Hello, " + test;

        System.out.println(result);

    }
}
