package lesson_21.hw_lesson_21.task_01;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Тарас Степаненко", "S12345", "Информатика", 2, 3.8);
        Teacher teacher = new Teacher("Николай Войтенко", "T98765", "Математика", "Профессор", 15);
        Doctor doctor = new Doctor("Доктор Анатолий Юрченко", "Кардиология", "D56789", 10, "Киевская городская больница");

        student.printInfo();
        student.study();
        student.attendLecture("Алгоритмы");
        student.takeExam("Структуры данных");

        System.out.println();

        teacher.printInfo();
        teacher.teach("Математический анализ");
        teacher.gradeStudent(student, 4.0);
        teacher.attendMeeting();

        System.out.println();

        doctor.printInfo();
        doctor.diagnosePatient("Александр Чернов");
        doctor.prescribeMedicine("Аспирин");
        doctor.performSurgery("Юлия Привалова");
    }
}
