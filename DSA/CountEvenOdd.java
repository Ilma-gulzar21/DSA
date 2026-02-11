import java.util.Scanner;
class CountEvenOdd {
     private  int EvenCount;
     private  int OddCount;

     public CountEvenOdd() {
        EvenCount=0;
        OddCount=0;
     }

     public void Count(int num) {
    if(num % 2==0 ) {
       EvenCount++;

    } else {
      OddCount++;
    }
   }
 void display() {
  System.out.println("Even = "+EvenCount);
  System.out.println("Odd = " +OddCount);
 }
}

public class CountEvenOdd {
    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    CountEvenOdd counter = new  CountEvenOdd();

       System.out.print("Enter the Number during Math Quiz = ");
       int n = sc.nextInt();
       counter.Count(n); 
       counter.display();   
       System.out.println("if you want to Enter marks Again YES or NO");
      String flag = sc.next();

     while(flag.equals("yes")) {
       System.out.print("Enter the Number during Math Quiz =");
       n = sc.nextInt();
       counter.Count(n); 
       counter.display();
       System.out.println("if you want to Enter marks Again YES or NO");
       flag = sc.next();
     }

  sc.close();
  }
}
