package ConditionalsAndLoops;

import java.util.Scanner;

public class LogicalStatements {
    public static void main(String[] args) {
        //AND (&&), OR (||) and NOT (!)

        /* Scanner - for the x and y */
        Scanner xScanner = new Scanner(System.in);
        Scanner yScanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = xScanner.nextInt();

        System.out.println("Enter y: ");
        int y = yScanner.nextInt();

        // AND - &&
        if (x > y && x - y > (x + y) / 2) {
            System.out.println(x + " is sensibly greater than " + y);
        } else {
            System.out.println("There is more to think about");
        }

        // OR - ||
        if (x > y && ((x + y) /2 > (x - y) || ((x /2 ) + y) > (x - y))) {
            System.out.println("Hulala");
        } else {
            System.out.println("It is a good habit to think like you really meant it");
        }

        // NOT - !
        if (x != y) {
            System.out.println(x + " is not equal to " + y);
        } else {
            System.out.println(x + " is equal to " + y);
        }
    }
}
