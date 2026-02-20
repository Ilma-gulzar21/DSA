import java.util.Scanner;
class ArrayElementAllPairs{
  static void ArrayPairs(int arr[]) {
    for(int i=0;i<arr.length;i++) {
   int.  currEl=i;
   for(int j=i+1;j<arr.length;j++) {
    System.out.print("(" +arr[i]+arr[j]+ ")");
   }
   System.out.println();
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

    ArrayPairs(arr);

    sc.close();
}
}  