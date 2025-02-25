package lesson_21.hw_lesson_21.task_01;

class Teacher {
    String name;
    String employeeId;
    String department;
    String position;
    int experienceYears;

    public Teacher(String name, String employeeId, String department, String position, int experienceYears) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
        this.experienceYears = experienceYears;
    }

    void teach(String subject) {
        System.out.println(name + " преподаёт предмет " + subject + ".");
    }

    void gradeStudent(Student student, double grade) {
        System.out.println(name + " поставил оценку " + student.name + " — " + grade);
    }

    void attendMeeting() {
        System.out.println(name + " присутствует на собрании кафедры.");
    }

    void printInfo() {
        System.out.println("Информация о преподавателе:\nИмя: " + name + "\nТабельный номер: " + employeeId +
                "\nКафедра: " + department + "\nДолжность: " + position + "\nСтаж: " + experienceYears + " лет");
    }
}
