
import java.util.Scanner;
class textAnalysis {
       private String sentence;
       private char letter;

    textAnalysis( String sentence,char letter) {
        this.sentence = sentence;
        this.letter = letter;
    }

    public int LetterOccur() {
        int LetterCount=0;
        for(int i=0;i<sentence.length();i++) {
        if( sentence.charAt(i)==letter) {
           LetterCount++;
        }
        }
        return LetterCount;
    }
   public int wordCounter() {
    int WordCount = 1;
    for(int i=0;i<sentence.length();i++) {
        if( sentence.charAt(i) == ' ') {
     WordCount++;
      }
    }
    return WordCount;
   }

   public int sentenceCount() {
    int sentenceCounter = 1;
    for(int i=0;i<sentence.length();i++) {
        int ch = sentence.charAt(i);
        if( ch =='.' || ch =='?' || ch == '!') {
           sentenceCounter++;
      }
    }
    return sentenceCounter;
   }
       
}
class TextAnalysis {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

         System.out.println("-----Enter a Sentences-----");
         String sentence = sc.nextLine();
         
         System.out.print("Enter a Digit to Check Occurance = ");
         char letter =  sc.nextLine().charAt(0);
         
        textAnalysis textRearch = new textAnalysis(sentence,letter);

        int counter = textRearch.LetterOccur();
        System.out.println("The letter "+letter+" Occurs = " + counter);

        int WordCounter = textRearch.wordCounter();
        System.out.println("Total Words  in the sentences  = " +WordCounter);

         int sentenceCounter = textRearch.sentenceCount();
         System.out.println("Total sentence   = " +sentenceCounter);

       sc.close();
    }
}