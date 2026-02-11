  import java.util.Scanner;
class Sum {
  private int sum;

  public Sum() {
    sum = 0;
  }

  public  int EvenSum(int num) {
 for(int i=1;i<=num;i++) {
       if(i%2==0) {
        sum=sum+i;
       }
    }
    return sum;
  }

  void Display(int num) {
     System.out.println("Sum of first " + num + " Terms= " + sum);

  }
}

class SumEven {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Sum sumEvenNumber = new Sum();
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    sumEvenNumber. EvenSum(n);
    sumEvenNumber. Display(n);
     sc.close();

   }
}
