import java.util.Scanner;
class  Arithematic{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first integer: ");
        a=sc.nextInt();
        System.out.print("enter second integer: ");
        b=sc.nextInt();
        int sum=a+b;
        int difference=a-b;
        int product=a*b;
        System.out.println("Sum= "+sum);
        System.out.println("Difference= "+difference);
        System.out.println("Product= "+product);
        if(b==0){
           System.out.println("Difference= "+0.0);
        }else{
            double quotient=(double)a/b;
             System.out.println("Quotient= "+quotient);
        }
        if(a>b)
        System.out.println("Maximum: "+a+"\nMinimum: "+b);
        else
        System.out.println("Maximum: "+b+"\nMinimum: "+a);
        sc.close();
    }
}