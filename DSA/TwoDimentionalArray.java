import java.util.Scanner;
public class TwoDimentionalArray {

     //search matrix
     public static boolean search(int mat[][],int target) {
          System.out.println("You Search "+target+" in the matrix");
          for(int i=0;i<mat.length;i++) {
               for(int j=0;j<mat[0].length;j++) {
                    if(target == mat[i][j]) {
                          System.out.println("target present at the index ("+i+","+j+")");
                          return true;
                    }
             }
       }
      System.out.println("target is not present");
      return false;
  } 

  //maximum element in matrix
  public static int max(int matrix[][]) {
     int maximum = Integer.MIN_VALUE;
     for(int i=0;i<matrix.length;i++) {
               for(int j=0;j<matrix[0].length;j++) {
                    if(maximum < matrix[i][j]) {
                         maximum = matrix[i][j];
                    }
               }
          }
          return maximum;
  }
  
    //minimum element in matrix
  public static int min(int matrix[][]) {
     int minimum = Integer.MAX_VALUE;
     for(int i=0;i<matrix.length;i++) {
               for(int j=0;j<matrix[0].length;j++) {
                    if(minimum > matrix[i][j]) {
                         minimum = matrix[i][j];
                    }
               }
          }
          return minimum;
  }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int [3][3];
    System.out.println("Enter a matrix Element");
    for(int i=0;i<matrix.length;i++) {
        for(int j=0;j<matrix[0].length;j++) {
            matrix[i][j] = sc.nextInt();
      }
  }
  System.out.println("-----matrix-----");
  for(int i=0;i<matrix.length;i++) {
      for(int j=0;j<matrix[0].length;j++) {
            System.out.print( matrix[i][j]+" ");
           }
           System.out.println();
        }
      search(matrix, 5);
      System.out.print("maximum Element in the Matrix = ");
      System.out.println(max(matrix));
      System.out.print("mainimum Element in the Matrix = ");
      System.out.println(min(matrix));
      }
}
