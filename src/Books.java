
import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        String yes="yes";
        Scanner keyboard = new Scanner(System.in);
  do {


      //Add new book
      Book book1 = new Book();
      book1.author = "Author Book 1";
      book1.title = "Title of Book 1";
      book1.description = "Description of Book 1";
      library.add(book1);

//Store user input into object from Book class array
        System.out.println("Please enter Book Title");
        book1.title = keyboard.nextLine();

        System.out.println("Please enter Book Author");
        book1.author = keyboard.nextLine();


        System.out.println("Please enter Book Description");
        book1.description = keyboard.nextLine();



      System.out.println("Would you like to enter in more books Yes/No");
      yes = keyboard.nextLine();


//if user enters yes run loop and if user enters no run for loop
  }while (yes.equalsIgnoreCase("Yes")) ;
//When user is done typing books print all book in array them on next line

        //for each loop getting books from array library collection input from user (taking the first element)
        for (Book book1:library)
        {
            System.out.println("All Books Listed: ");
            System.out.println("------------------------------");
            System.out.print(book1.title);
            System.out.println(" ");
            System.out.print(book1.author);
            System.out.println(" ");
            System.out.print(book1.description);


        }

    }
}
