import java.util.Scanner;

class Lexicographical {

    public int LexicographicalOrder(String str1, String str2) {

        for(int i = 0; i < str1.length(); i++) {

            if(str1.charAt(i) < str2.charAt(i)) {
                int result = str1.charAt(i) - str2.charAt(i);
                return result;
            }

            else if(str1.charAt(i) > str2.charAt(i)) {
                int result = str1.charAt(i) - str2.charAt(i); 
                return result;
            }
        }

        return 0;
    }
}

class LargestStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sc.next();

        System.out.println("Enter second string");
        String str2 = sc.next();

        Lexicographical obj = new Lexicographical();

        System.out.println(obj.LexicographicalOrder(str1, str2));
    }
}