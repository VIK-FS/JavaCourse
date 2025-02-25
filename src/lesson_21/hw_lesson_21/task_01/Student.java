package lesson_21.hw_lesson_21.task_01;

class Student {
    String name;
    String studentId;
    String major;
    int year;
    double gpa;

    public Student(String name, String studentId, String major, int year, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.gpa = gpa;
    }

    void study() {
        System.out.println(name + " учится.");
    }

    void attendLecture(String subject) {
        System.out.println(name + " посещает лекцию по предмету " + subject + ".");
    }

    void takeExam(String subject) {
        System.out.println(name + " сдаёт экзамен по предмету " + subject + ".");
    }

    void printInfo() {
        System.out.println("Информация о студенте:\nИмя: " + name + "\nID: " + studentId + "\nСпециальность: " + major +
                "\nКурс: " + year + "\nСредний балл: " + gpa);
    }
}
