import java.util.Scanner;
class  BinarySearch{
    static int Binary_Search(int arr[],int key) {
        int start=0;
        int end=arr.length-1;

      while(start<=end) {
         int mid=(start+end)/2;
        if(key==arr[mid]) {
               return mid;
           }
       if(key<arr[mid]) {
                end=mid-1;
      } else {
                start=mid+1;
           }  
         }
         return -1;
      }
    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Size of an Array  = ");
    int n=sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter Array Element");
    for(int i=0;i<n;i++) {
    arr[i]=sc.nextInt();
      }
    System.out.println("Enter the  Array Element you want to search");
    int key =sc.nextInt();
    int result= Binary_Search(arr,key); 
    if(result== -1) {
 System.out.println(key+ " is  not present");
    } else {
             System.out.println(key+ " is present at index "+result);
    }
 
    sc.close();
}
}  