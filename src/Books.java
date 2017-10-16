import java.util.Scanner;

public class Books {
    public static void main(String[] args) {

        String yes="yes";
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int size = 25;


        //Allocates memory for array
       String title[] = new String[size];
        String author[] = new String[size];
       String description[] = new String[size];


  do {


//Store user input into array
        System.out.println("Please enter Book Title");
        title[counter] = keyboard.nextLine();

        System.out.println("Please enter Book Author");
        author[counter] = keyboard.nextLine();


        System.out.println("Please enter Book Description");
        description[counter] = keyboard.nextLine();


      System.out.println("Would you like to enter in more books Yes/No");
      yes = keyboard.nextLine();
        counter++;//Runing counter to keep track of stored variables in array


//if user enters yes run loop and if user enters no run for loop
  }while (yes.equalsIgnoreCase("Yes")) ;
//When user is done typing books print all book in array them on next line

        //using i as counter to check books from array
        for (int i = 0; i < counter; i++)
        {
            System.out.print(title[i]);
            System.out.println(" ");
            System.out.print(author[i]);
            System.out.println(" ");
            System.out.print(description[i]);


        }

    }
}
