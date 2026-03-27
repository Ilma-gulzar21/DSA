import java.util.Scanner;
class Sorting {
    public void BubbleSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]> arr[j+1]) {
                    int temp = arr[j];
                   arr[j] =  arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }
    }
}
class Bubble_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the Size of an Array Element = ");
         int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter an Array element to Sort");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
       Sorting obj = new Sorting();
       obj.BubbleSort(arr);
         System.out.print("Sorted Array elements are = ");
         for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
