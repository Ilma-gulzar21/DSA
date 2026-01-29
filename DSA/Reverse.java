import java.util.Scanner;
class Reverse{
  static void ReverseWithSwapping(int arr[]) {
    int start=0;
    int end =arr.length-1;
    while(start<end) {
      int temp = arr[start];
       arr[start] = arr[end];
       arr[end]=temp;
       start++;
       end-- ;
             }
      }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of an Array  = ");
    int n=sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter Array Element");
    for(int i=0;i<n;i++) {
    arr[i]=sc.nextInt();
      }

      ReverseWithSwapping(arr);
     System.out.println("Reverse Array");
     for(int i=0;i<n;i++) {
     System.out.println(arr[i]+" ");
      }
    sc.close();
}

}  
