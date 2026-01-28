import java.util.Scanner;
public class LargestNum {

  static int LargestValue(int arr[]) {
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
     if(largest<arr[i]) {
      largest=arr[i];
     }
    }
    return largest;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int arr[]= {2,6,99,22,37,40,90};
     int largest=LargestValue(arr);
    System.out.println("largest = "+largest);
  sc.close();
 }
    
}
