package SamplePrograms;

public class Example1 {

    public static void main(String[] args) {
        int x[] = {97, 87, 45, 98, 0, 0, 0, 0}; // make an array
        //         0   1   2   3   4  5  6  7

        int logicalSize = 4;
        //logicalSize = number of items stored
        //it is also the location wher ethe Next new item will go

        int abc[] = new int[5], xyz[];

        xyz = abc; //ok     this creates a pointer to abc
        //abc and xyz both point to the same list of numbers

        abc[4] = 50;
        System.out.println(xyz[4]); //get 50
        xyz[1] = 99; //using xyz reference to put 99 in list at location 1

        for (int i = 0; i < abc.length; i++) {
            System.out.format("abc[%d] = %d\n", i, abc[i]);
        }

        x[1] = 100;//2nd location
        int ii = 4;
        x[ii - 1] = 94;
        int count7 = 0;
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
            if (x[i] == 7) {
                count7++;
            }
        }
        //System.out.println("There are " + count7 + " 7's in the list");
        //system.out.println("" + x[10]); index out of bounds
        System.out.println("Adding 5th Assignment mark");
        if (logicalSize < x.length) {
            x[logicalSize] = 82;
            logicalSize++;
        }
        System.out.println("Updated list of marks:");
        for (int i = 0; i < logicalSize; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
        }
    }

}
