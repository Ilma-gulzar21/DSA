import java.util.Scanner;
class shapeInersection {

    void rectangle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for Rectangle 1");
        System.out.print("enter x1 =  ");
        int x1 = sc.nextInt();
        System.out.print("enter y1: = ");
        int y1 = sc.nextInt(); 
        System.out.print("enter width1 = ");
        int w1 = sc.nextInt(); 
        System.out.print("enter height1 = ");
        int h1 = sc.nextInt();

        System.out.println("Enter for Rectangle 2");
        System.out.print("enter x2 = ");
        int x2 = sc.nextInt();
        System.out.print("enter y2 =  ");
        int y2 = sc.nextInt(); 
        System.out.print("enter width2 = ");
        int w2 = sc.nextInt(); 
        System.out.print("enter height2 = ");
        int h2 = sc.nextInt();

        int  left = Math.max(x1,x2);
        int  top = Math.max(y1,y2);
        int  right = Math.min((x1+w1),(x2+w2));
        int  bottom = Math.min((y1+h1),(y2+h2));

        if(h1+y1<x2 || h2+y2<x1) {
            System.out.println("No intersection");
        } else {
      System.out.println("intersection: ("+left+","+top+","+(right-left)+","+(bottom-top)+")");
        }
        sc.close();
    }
}
public class RectangleIntersection  {
    public static void main(String[] args) {
       shapeInersection inersect =new shapeInersection();
        inersect.rectangle();
    }
}
