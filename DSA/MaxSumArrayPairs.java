import java.util.Scanner;
class B {
         static void MaxSumArrayPairs(int arr[]) {
            int maxSum=Integer.MIN_VALUE;
            int prefix[]= new int[arr.length];
            prefix[0]=arr[0];
            
            for(int i=1;i<prefix.length;i++) {
                 prefix[i] = prefix[i-1] + arr[i];                                                                                  
               }
                                              
           int CurrSum=0;
            System.out.println("All Sub-Array");
                for(int i=0;i<arr.length;i++) {
                     int start=0;
                 for(int j=i;j<arr.length;j++) {
                       int end=j;
                 CurrSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
          
             if(maxSum < CurrSum) {
               maxSum = CurrSum;
             }
    }
  }
    System.out.println("Max Sum = " +maxSum);
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

     MaxSumArrayPairs(arr);
    sc.close();
}
}  