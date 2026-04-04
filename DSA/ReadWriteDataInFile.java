import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class Record {
    private String name;
    private int roll_no;
    private  char Grade;
    private boolean result;

   public Record() {
       System.out.println("Enter a Student Record");
    }

    public void getter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name = ");
        this.name = sc.nextLine();
        System.out.print("Enter a Roll number = ");
        this.roll_no = sc.nextInt();
        System.out.print("Enter  a Grade = ");
        this.Grade = sc.next().charAt(0);
        System.out.print("Enter Student is Pass true or false = ");
        this.result = sc.nextBoolean(); 
        sc.close();    
    }

    public void WriteData() {
        File file = new File("RecordFile.txt");
        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("RecordFile.txt"));
            writer.write("Name = "+this.name);
            writer.write("\nRoll Number = "+this.roll_no);
            writer.write("\nGrade = "+this.Grade);
            writer.write("\nResult = "+this.result+"\n");
            writer.write("File Size = " + file.length() + " bytes\n");
            writer.write("Absolute Path = " + file.getAbsolutePath());
            writer.close();
            System.out.println("Data is written REcordFile.txt");
           System.out.println("File Size = " + file.length() + " bytes");
           System.out.println("Absolute Path = " + file.getAbsolutePath());
        } catch(IOException e) {
            System.out.print("Error = "+e.getMessage());
        }
    }

    public void ReadData() {
      try {
          BufferedReader data = new BufferedReader(new FileReader("RecordFile.txt"));
          String line;
          while((line=data.readLine()) != null) {
            System.out.println(line);
          }
      } catch(IOException e) {
        System.out.println("Error"+e.getMessage());
      }
    }
}

class ReadWriteDataInFile {
    public static void main(String args[]) {
        Record data = new Record();
        data.getter();
        data.WriteData();
        data.ReadData();
    }
}
