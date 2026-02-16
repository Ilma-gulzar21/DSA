import java.util.Scanner;

public class convertRoundFloorCeilValue {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Float value = ");
        float num = sc.nextFloat();

        int numInteger = (int) num;
        float factPart = num - numInteger;

        // Round Value
        double numRound;
        if (factPart >= 0.5) {
            numRound = numInteger + 1;
        } else if (factPart <= -0.5) {
            numRound = numInteger - 1;
        } else {
            numRound = numInteger;
        }
        System.out.println("Rounded value = " + numRound);

        //Ceil Value
        double numCeil;
        if (num > 0 && factPart > 0) {
            numCeil = numInteger + 1;
        } else {
            numCeil = numInteger;
        }
        System.out.println("Ceil value of num = " + numCeil);

        //Floor Value
        double numFloor;
        if (num >= 0) {
            numFloor = numInteger;
        } else if (num == numInteger) {
            numFloor = numInteger;
        } else {
            numFloor = numInteger - 1;
        }
        System.out.println("Floor value of num = " + numFloor);
        System.out.println("NumInteger= " + numInteger);
        sc.close();
    }
}