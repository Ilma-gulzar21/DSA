import java.util.Scanner;
class circle {
private double radius;
private final double pi;
    public circle(double radius) {
    this.radius =radius;
    this.pi = 3.14;
}


public void AreaAndPerimeterCircle() {
    System.out.println("Area = " +(pi*radius*radius));
    System.out.println("Perimeter = "+(2 * pi*radius));
}

public void checkCircle(int x,int y,int k,int h) {
    double  distance = Math.sqrt(Math.pow((x-h),2)    +  Math.pow((y-k),2));
    if(distance < radius) {
        System.out.println(k+h+" Point is inside the circle");
    } else if(distance > radius) {
             System.out.println(k+h+" Point is Outside the circle");
    } else {
             System.out.println("(" + k + "" + h + ")" + " Point is On the circle");
    }
}
}
class AreaAndPerimeter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius");
    double radius = sc.nextDouble();
    System.out.print("Enter first coordinate of center of the circle = ");
    int x = sc.nextInt();
    System.out.print("Enter second coordinate of center of the circle = ");
    int y = sc.nextInt();
    System.out.print("Enter first coordinate of the point = ");
    int k = sc.nextInt();
    System.out.print("Enter second coordinate  of the point = ");
    int h = sc.nextInt();
   circle calculate = new circle(radius);
    calculate.checkCircle(x,y,k,h);
    calculate.AreaAndPerimeterCircle();
        sc.close();
    }
}