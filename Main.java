package tr.edu.beykoz.oop;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Kaan");

        Student student2 = new Student("Ahmet");


        StudentName simple = new StudentName();

        simple.printNames(student1, student2);

    }

}