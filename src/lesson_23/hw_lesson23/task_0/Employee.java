package lesson_23.hw_lesson23.task_0;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void info() {
//        String result = String.format("Имя: %s\nвозраст: %d лет\nзарплата: %d €\n", name, age, salary);
//        return result;
        System.out.printf("Имя: %s\nВозраст: %d лет\nЗарплата: %d €\n", name, age, salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть больше 17 лет!!!");
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
