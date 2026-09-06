
import java.util.Scanner;
class Str {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String = ");
        String str = sc.next();
        String newStr = "";

        for(int i=0;i<str.length();i++) {
            boolean found = false;
            for(int j=0;j<newStr.length();j++) {
                if(str.charAt(i) == newStr.charAt(j)) {
                    found = true;
                    break;
                }
        
            }
            if(found == false) {
                newStr=newStr+str.charAt(i);
            }
        }
          System.out.println("New String = " + newStr);
    }
}
