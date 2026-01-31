import java.util.*;
public class PairArray {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int arr[] ={3,6,9,1,4};
    for(int i=0;i<arr.length;i++) {
         int curr=arr[i];
        for(int j=i+1;j<arr.length;j++) {
           System.out.print( "("+ curr + "," + arr[j] + ")" );
        }
        System.out.println();
    }
sc.close();
}
}