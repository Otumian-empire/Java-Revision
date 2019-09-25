package ConditionalsAndLoops;

public class IfElseNestIfStatements {
    public static void main(String[] args) {
        /* If statements and else statements */
        int x = 12, y = 13;

        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is greater than " + y);
        }

        /* nested if statements */
        if (((x * y) + 1) < (y * y)) {
            System.out.println("blizzard!!!");

            if (x * x + y > y + x + 10) {
                System.out.println("Blizzardoram in french");
            }
        }
    }
}
