package SamplePrograms;

import java.util.Scanner;

public class ParallelArrays1 {

    public static void main(String[] args) {
        String student[] = new String[5];
        int mark[] = new int[3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter name of student " + (i + 1) + "--> ");
            student[i] = s.nextLine();
            System.out.println("Enter mark for " + student[i] + "--> ");
            mark[i] = s.nextInt();
            s.nextLine();
        }
        double avg=0;
        for (int i = 0; i < student.length; i++) {
            System.out.format("%10s%20d\n",student[i], mark[i]);
            avg += (double)mark[i];
        }
        avg /=3;
        System.out.println("-----------------------------------");
        System.out.format("Average: %10.2f", avg);
    }

}
