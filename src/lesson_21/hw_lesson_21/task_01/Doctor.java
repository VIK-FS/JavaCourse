package lesson_21.hw_lesson_21.task_01;

class Doctor {
    String name;
    String specialization;
    String licenseNumber;
    int experienceYears;
    String hospital;

    public Doctor(String name, String specialization, String licenseNumber, int experienceYears, String hospital) {
        this.name = name;
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
        this.hospital = hospital;
    }

    void diagnosePatient(String patientName) {
        System.out.println(name + " ставит диагноз пациенту " + patientName + ".");
    }

    void prescribeMedicine(String medicine) {
        System.out.println(name + " выписывает лекарство: " + medicine + ".");
    }

    void performSurgery(String patientName) {
        System.out.println(name + " проводит операцию пациенту " + patientName + ".");
    }

    void printInfo() {
        System.out.println("Информация о враче:\nИмя: " + name + "\nСпециализация: " + specialization +
                "\nНомер лицензии: " + licenseNumber + "\nСтаж: " + experienceYears + " лет\nБольница: " + hospital);
    }
}
