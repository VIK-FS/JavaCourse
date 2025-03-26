package lesson_42.hw_lesson_42.task_1;

public class Sportsman implements Comparable<Sportsman>{
    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {

        return String.format("Car {name= '%-11s', age= '%2s', score= '%3s'}", name, age, score);
    }

    @Override
    public int compareTo(Sportsman s) {
        return this.name.compareTo(s.name);
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
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
