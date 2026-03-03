import java.util.Scanner;
class sumProduct {
    private int sum;
    private int product;

   public  sumProduct() {
    sum = 0;
    product = 1;
   }

   public int calculateSum(int arr[]) {
      for(int i=0;i<arr.length;i++) {
        sum = sum + arr[i];
        }
    return sum;
    }

       public int calculateProcuct(int arr[]) {
        for(int i=0;i<arr.length;i++) {
        product = product *arr[i];
         }
    return product;
    }
}

class SumAndProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sumProduct calculate = new sumProduct();
        System.out.print("Enter how many number you want to input = ");
        int n=sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++) {
                  System.out.println("Enter "+(i+1)+" number");
                  arr[i]= sc.nextInt();
             }
System.out.println("Total sum = "+ calculate.calculateSum(arr));
System.out.println("Total sum = "+ calculate.calculateProcuct(arr));
sc.close();
    }
}