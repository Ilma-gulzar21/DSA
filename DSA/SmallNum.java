import java.util.Scanner;
public class SmallNum {

  static int smallValue(int arr[]) {
    int small=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++) {
     if(small>arr[i]) {
      small=arr[i];
     }
    }
    return small;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int arr[]= {162,156,99,22,37,40,90};
     int small=smallValue(arr);
    System.out.println("Smallest  = "+ small);
  sc.close();
 }
    
}
