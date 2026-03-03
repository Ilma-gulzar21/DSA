 
import java.util.Scanner;
class combinations {
 
    public combinations() {
       System.out.println("Enter how many number you want to enter");
    }

     static  void AllCombination(int arr[]) {
            if(arr[0]==arr[1] && arr[1]==arr[2]) {
                for(int i=0;i<arr.length;i++) {
                 System.out.print(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++) {
        for(int j=0;j<arr.length;j++) {
            for(int k=0;k<arr.length;k++) {
                if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]) {
                    System.out.println(arr[i]+ "" +arr[j]+ ""+arr[k]); 
                }
            }
        }
       } 
    }
}
class combinationsOfDigits {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    combinations pair = new combinations();
    int arr[] = new int[3];
    for(int i=0;i<3;i++) {
        System.out.print("Enter the Digit = ");
        arr[i]=sc.nextInt();
    }
    pair. AllCombination(arr);
    sc.close();
    }
 }
