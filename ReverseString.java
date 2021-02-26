// Jake Prisby
// 2/26/2021
// Reverse String

// Import
import java.util.Scanner;
import java.util.InputMismatchException;

// Class for String reverser
public class ReverseString {
   
   // Main Method
   public static void main ( String[] args ) {
      Scanner s = new Scanner( System.in ); // Scanner Object for user input
      // Loop for the menu
      do {
         // Console menu
         System.out.println("What would you like to do: ");
         System.out.println("1. --> Reverse String");
         System.out.println("2. --> Exit");
         try {
         // Check what the user wants to do
         int menuInput = s.nextInt();
            if ( menuInput == 1 ) {
               // Procede with the reverse string process
               s.nextLine(); // Refresh Scanner ( Resolves issue scanner inputs being skipped over )
               System.out.print("Enter the string you want reversed: ");
               String word = s.nextLine(); // User input stored in String
               System.out.println(reverse(word)); // Call to "reverse" method and print out the results
            } else {
               // Exit the program, if the user enters anything other than 1
               break;  
            }
         } catch ( InputMismatchException e) {
            // Here the user entered a string when asked for an integer
            s.nextLine(); // Refresh Scanner ( Resolves issue scanner inputs being skipped over )
            System.out.println( "ERROR: Please enter an integer value!!!");
         }
      } while(true);
   }
   
   // Desc.: Reverse the String input
   // Input: String 
   // Ouput: The input String with the characters in reverse order
   private static String reverse( String str ) {
      String reorderedString = "";
      // Traverse the string backwards
      for ( int i = str.length() - 1; i >= 0; i-- ) {
         reorderedString += str.charAt(i); // Character at index i of the word is added to the reversed word
      }   
      return reorderedString; // Return the reversed string
   }
}