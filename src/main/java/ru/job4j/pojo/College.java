package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Frodo Ivanovich Beggence");
        student.setGroup("The Fellowship of the Ring");
        student.setDateOfAdmission(2002, 02, 20);

        System.out.println("Student full name : " + student.getName() + System.lineSeparator()
                + "Group : " + student.getGroup() + System.lineSeparator()
                + "Date of admission : " + student.getDateOfAdmission());
    }
}
