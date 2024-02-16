package reyes_oop_night;

import java.util.Scanner;

public class REYES_OOP_NIGHT {
      

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text message: ");
        String message = scanner.nextLine();

        // Check if the capital letters are in the correct position
        if (checkCapitalword(message)) {
            System.out.println("UwU");
        } else {
            System.out.println("JEJE!");
        }

        scanner.close(); 
    }

    // Method to check the placement of capital letters in a message
    private static boolean checkCapitalword(String message) {
             String[] words = message.split("\\s+");

        
        for (String word : words) {
            // Check if the word has more than one character and the second character is a capital letter
            if (word.length() > 1 && Character.isUpperCase(word.charAt(1))) {
                return false;
            }
        }

        // No misplaced capital letters found, return true
        return true;
    }
}