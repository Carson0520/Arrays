package SamplePrograms;

public class Array2DEx1 {

    public static void main(String[] args) {
        int x[][] = new int[4][5];
        //2D array of 4 rows by 5 columns = 20 loctaions

        //x[3][2] = 50;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num = 10 * row + col;
                x[row][col] = num;
                System.out.format("%5d|", x[row][col] + " | ");
            }
            System.out.println("");//new line at end of row

        }
        //make and initialize a 2d array
        System.out.println("\n-------------------------------\n");
        int marks[][] = {
            {54, 34, 75, 23},
            {86, 96, 74, 86},
            {99, 95, 97, 74},
            {43, 32, 22, 31}
        };
        //print marks
        //marks.length - number of rows

        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format("%5d|", marks[row][col]);
            }
            System.out.println("");//new line at end of row
        }
    }

}
