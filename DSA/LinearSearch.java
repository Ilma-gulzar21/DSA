import java.util.Scanner;
public class LinearSearch {

  static int Linear(int arr[], int key) {
    for(int i=0;i<arr.length;i++) {
      if(key == arr[i]) {
        return key;
      }
    }
    return -1;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int arr[]= {2,6,8,22,37,40,45};
     int key=100;
     int index= Linear(arr,key);
     if(index == -1) {
      System.out.println("Key not Found = "+index);
     } else {
       System.out.println("Key Found = "+index);
     }
  sc.close();
 }
    
}
