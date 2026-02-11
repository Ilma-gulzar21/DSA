import java.util.Scanner;
class SquareAndCube {
     private int square;
     private int cube;

  public SquareAndCube() {
    square = 0;
    cube = 0;
  }

  public int Square(int n) {
    for(int i=1;i<=n;i++) {
      square = i*i;
      }
          return square;
  }

    public int Cube(int n) {
    for(int i=1;i<=n;i++) {
       cube = i*i*i;
       }
     return cube;
  }

      void display(int n) {
      System.out.println("Square of 1 to "+n);
      System.out.println("number   |   Square      |   Cube");
      for(int i=1;i<=5;i++) {
      System.out.printf("%3d %13d %13d\n",i,Square(i),Cube(i));
        }
     }
  }

class SquareCube {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  SquareAndCube calculate = new SquareAndCube();
  System.out.print("Enter the value of n = ");
  int n= sc.nextInt();
  calculate.display(n);
sc.close();
}
}
