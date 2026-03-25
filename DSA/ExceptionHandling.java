import java.io.*;
import java.util.*;

class findAverage {

    private int count;
    private double sum;
    private double Average;
    private boolean invalidFount = false;
    Scanner sc;

    findAverage() {
        count = 0;
        sum = 0;
        Average = 0;
    }

    public void setter() {
        try {
            File inputFile = new File("input.txt");
            sc = new Scanner(inputFile);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception: FileNotFoundException- The File Input.txt does not exist");
            System.exit(0);
        }
    }

    public void AverageCal() {       
        while (sc.hasNext()) {
            try {
                double num = sc.nextDouble();
                sum = sum + num;
                count++;
            } 
            catch (Exception e) {
                String invalid = sc.next();
                System.out.println("Exception: InvalidDataException - \"" + invalid + "\" is not a valid number.");
                invalidFount = true;
                break;
            }
        }

        if (count > 0) {
            Average = sum / count;
        } else if(count == 0) {
            throw new IllegalArgumentException("No numeric values Found in the File");
        }
        sc.close();
    }

    public void Display() {
        if(invalidFount) {
            return;
        }
        try {
            FileWriter writer = new FileWriter("Output.txt");
            writer.write("Average = " + Average);
            writer.close();
            System.out.println("Average written to Output.txt");
        } 
         catch (IOException e) {
            System.out.println("Exception: IOException - Could not write to the file Output.txt."+e.getMessage());
        }
    }
}

class first {
    public static void main(String[] args) {
        findAverage obj = new findAverage();
        try{
        obj.setter();
        obj.AverageCal();
        obj.Display();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: IllegalArgumentException-"+e.getMessage());
        }
    }
}