 // integer Array arr input by the user return true if any value appears at least twice in the array,and return false if ever elemen is distinct 
 import java.util.Scanner;
 class CheckTwiceArrayElement {

    static boolean Twice(int arr[]) {
    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i]==arr[j]) {              
                   return true;
            }  
        }
    }
      return false;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Size of an Array = ");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the Array Element ");
    for(int i=0;i<n;i++) {
        arr[i]=sc.nextInt();
    }
     System.out.println( Twice(arr));
    sc.close();
    }
 }