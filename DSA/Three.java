import java.util.Scanner;
public class Three {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the value of n");
int n=sc.nextInt();
double Fahrenheit[]= new double[n];
double Calsius[]= new double[n];

System.out.println("Enter the "+n+ " Times Temperature in Fahrenheit");
for(int i=0;i<n;i++) {
Fahrenheit[i]=sc.nextDouble();
}

System.out.println("Celsius     Fahrenheit");
for(int i=0;i<n;i++) {
Calsius[i]=(Fahrenheit[i]-32)/1.8;
System.out.printf("%5.2f      %5.5f %n",Fahrenheit[i],Calsius[i]);
}
sc.close();
}
}