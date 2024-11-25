package week6.mondelingeExamens;

import java.util.Scanner;

public class TestExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wanneer begint het examen? ");
        String start = scanner.nextLine();
        System.out.print("hoeveel minuten per examen? ");
        int minutesPerExam = scanner.nextInt();
        System.out.print("hoeveel studenten zijn er? ");
        int numberOfStudents = scanner.nextInt();

        Schedule exam = new Schedule();
        exam.CreateSchedule(numberOfStudents, minutesPerExam, start);
        exam.printSchedule();

    }
}
