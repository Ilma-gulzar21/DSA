import java.util.Scanner;
class Book {
    private int Book_id;
    private  String Title;
    private String author;
    private String Genre;
    private boolean Available;

    Book() {
        Book_id =0;
        Title = "";
        author ="";
        Genre = "";
    } 

        void getter() {
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter The Book ID = ");
              Book_id = sc.nextInt();
              sc.nextLine();

              System.out.print("Enter The Title = ");
              Title = sc.nextLine();

              System.out.print("Enter The Author = ");
              author = sc.nextLine();

              System.out.print("Enter The  Genre = ");
              Genre = sc.nextLine();

             System.out.print("Book Availability = ");
             Available = sc.nextBoolean();
             sc.close();
    } 

    void setter() {
        System.out.println("----Book Details----");
        System.out.println(" Book_id = "+ Book_id );
        System.out.println(" Title = "+ Title);
        System.out.println("Author  = "+author);
        System.out.println("Genre = "+Genre);
        System.out.println("Availability= "+Available);
    }
}
class q1 {
public static void main(String[] args) {
Book library = new Book();
System.out.println("----Enter Book Details----");
library.getter();
library.setter();
}
}