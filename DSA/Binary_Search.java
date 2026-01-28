import java.util.Scanner;
public class Binary_Search {

  static int BinarySearch(int arr[], int key) {
             int  start = 0;
             int end =arr.length-1;

        while(start <= end) {
      int mid= (start+end)/2;
        if(key == arr[mid]) {
          return key;
        } 
        if(key<arr[mid]) {
          end=mid-1;
        } else {
          start = mid+1;
        }      
    }
    return -1;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
     int arr[]= {2,6,8,22,37,40,45};
     int key=40;
     int index=BinarySearch(arr,key);
     if(index == -1) {
      System.out.println("Key not Found = "+index);
     } else {
       System.out.println("Key Found = "+index);
     }
  sc.close();
 }
    
}
