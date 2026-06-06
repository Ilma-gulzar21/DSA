import java.util.Scanner;
class StairCaseSearch {
    public static boolean StairCase(int matrix[][],int target) {
     int row =0;
     int col = matrix[0].length-1;
     while(row<matrix.length && col >=0) {
        if(matrix[row][col] == target) {
            System.out.println("Found key at the index = ("+row+","+col+") ");
            return true;
         } else if(target < matrix[row][col]) {
            col--;
         } else {
            row++;
         }
      }
     System.out.println("Target not found");
     return false;
} 
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Size of Rows = ");
    int n = sc.nextInt();
     System.out.print("Enter the Size of Column  = ");
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

        System.out.println("Enter a target to Search in the Matrix");
        int target =sc. nextInt();

      System.out.println(StairCase(matrix,target)); 
      }
}

