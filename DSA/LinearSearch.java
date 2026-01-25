import java.util.Scanner;
class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int index=-1;
        boolean found=false;

        System.out.print("Enter the Size of an Array = ");
        int n=sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Array Element");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        } 

        System.out.println("Enter the element you want to search in the Array");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if(key == arr[i]) {
               index=i;
               found = true;
            } 
        }
      if(found) {
        System.out.println(key +" is present at index "+index);
      } else {
       System.out.println(key +" is not present in the array");
      }
      sc.close();
    }
}