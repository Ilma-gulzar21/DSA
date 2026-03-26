import java.util.Scanner;
class Reverse {
    private String Sentence;

    public String ReverseWord(String Sentence) {
    StringBuffer sb = new StringBuffer("");
    String word[]=Sentence.split(" ");

     for(int i=0;i<word.length;i++){
        for(int j=word[i].length()-1;j>=0;j--) {
           sb.append(word[i].charAt(j));
         }
       sb.append(" ");
       }  
       return sb.toString().trim();
   }
}
class ReverseEachWord {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String Sentence =sc.nextLine();
    Reverse obj = new Reverse();
   System.out.println(obj. ReverseWord(Sentence));
    sc.close();
    }
}