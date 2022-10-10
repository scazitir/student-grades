package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        student.name = scan.nextLine();
        student.grade1 = scan.nextDouble();
        student.grade2 = scan.nextDouble();
        student.grade3 = scan.nextDouble();

        System.out.println("Final Grade: " + student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.println("Missing points: " + student.missingPoints() + " points");
        } else {
            System.out.println("APPROVED");
        }

        scan.close();
    }
}
