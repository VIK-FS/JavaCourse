package lesson_28.hw_lesson_28.task_1;

public class MainApp {
    public static void main(String[] args) {
        Human[] ranners = {
                new Human(10,15),
                new Amateur(15,10),
                new Professional(25,5)
        };

        for (int i = 0; i < ranners.length; i++) {
            ranners[i].run();
            System.out.println("=================================");
        }
/*
        Human human = new Human(10, 15);
        human.run();

        System.out.println("=================================");
        Amateur amateur = new Amateur(15, 10);
        amateur.run();

        System.out.println("=================================");
        Professional proffesional = new Professional(25, 5);
        proffesional.run();
 */
    }
}
