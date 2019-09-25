package BasicConcepts;

import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        /* Taking user input using the scanner class */
        Scanner input = new Scanner(System.in);

        /* taking user input into firstName */
        System.out.println("Enter first name: ");
        String firstName = input.next();

        /* output of the input taken from the user */
        System.out.println("first name: " + firstName);

        /* taking user hobby */
        Scanner hobbyScanner = new Scanner(System.in);
        System.out.println("Enter hobby: ");
        String hobby = hobbyScanner.nextLine();

        /* output hobby*/
        System.out.println("hobby: " + hobby);

    }
}
