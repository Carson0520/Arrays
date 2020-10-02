package SamplePrograms.ArrayMethods;

public class ArrayOfObjects {

    public static void main(String[] args) {
        //this does not make 5 rooms
        //this makes an empty array to hold 5 rooms
        Room myRooms[] = new Room[5];
        String roomNames[] = {"Kitchen", "Den", "Washroom", "Bedroom", "Playroom"};
        
        for (int i = 0; i < myRooms.length; i++) {
            myRooms[i] = new Room(
                    "Room " + (i+1),
                    (int)(Math.random()*20+10),
                    (int)(Math.random()*20+10)
            );
            System.out.println(myRooms[i]);
        }
        int avgArea=0;
        for (int i = 0; i < myRooms.length; i++) {
            avgArea += myRooms[i].getArea();
        }
        avgArea /= myRooms.length;
        System.out.println("The average room size is "+ avgArea);
    }

}
