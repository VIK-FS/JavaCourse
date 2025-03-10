package lesson_29.children;

public  class Parent {
    String name;

    // Автоматически добавляется при компиляции

//    public Parent(){
//
//    }


    public Parent(String name) {
        this.name = name;
    }

    final void show(){
        System.out.println("Show must go on!");
    }
}
