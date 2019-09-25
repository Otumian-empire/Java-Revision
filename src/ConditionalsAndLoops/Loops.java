package ConditionalsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Loops: for loop, while loop, switch, do while

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while loop
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            ++x;
        }

        // switch
        Scanner nScanner = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int y = nScanner.nextInt();

        switch (y) {
            case 2:
                System.out.println("good, y is " + 2);
                break;
            case 3:
                System.out.println("good, y is " + 3);
                break;
            case 4:
                System.out.println("good, y is " + 4);
                break;
            default:
                System.out.println("okay, what is the value of y...?\nY is " + y);
                break;
        }

        // do-while
        int p = 0;
        do {
            System.out.println(p);
            p++;
        } while (p < 10);

    }
}
