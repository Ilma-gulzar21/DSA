import java.util.Scanner;
public class SpiralMatrix {

    public static void SpiralMatrix(int matrix[][]) {
        int startRow=0;
        int startcol = 0;
        int endRow = matrix.length-1;
        int endcol = matrix[0].length-1;


        while(startRow <= endRow && startcol <= endcol) {
            //top
            for(int j =startcol;j<=endcol;j++) {
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
              for(int i =startRow+1;i<=endRow;i++) {
                System.out.print(matrix[i][endcol]+" ");
                }

            //bottom 
             for(int j = endcol-1;j>=startcol;j--) {
                if(startRow == endRow) {
                      break;
                }
                 System.out.print(matrix[endRow][j]+" ");
              }

               //left
              for(int i = endRow-1; i>=startRow+1;i--) {
              if(startcol == endcol) {
                    break;
               }
             System.out.print(matrix[i][startcol]+" ");
            }
            startRow++;
            startcol++;
            endRow--;
            endcol--;
        }
    }
   
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Size of Rows = ");
    int n = sc.nextInt();
     System.out.print("Enter the Size of Column = ");
     int m = sc.nextInt();
    int matrix[][] = new int [n][m];

   System.out.println("------Enter a matrix Element------");
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
      System.out.println("---Spiral matrix---");
        SpiralMatrix(matrix);

   }
}


