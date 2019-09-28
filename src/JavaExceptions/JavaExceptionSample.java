package JavaExceptions;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class JavaExceptionSample {
    public static void main(String[] args) {

        // Exception handling
        try {
            int x = 12, y = 0;
            System.out.println(Math.floorDiv(x, y));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] list = {1,3};
            System.out.println(list[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // this line was meant to crash actually
        // System.out.println(1/0);

        try {
            getAge(23);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            getAge(2019);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{getAge(1996);} catch(Exception ignored){}

        try {System.out.println(divideMe(23, 9));} catch (ArithmeticException ignored) {}
        try{System.out.println(divideMe(23, 0));}catch (ArithmeticException ignored){}
    }
    private static double divideMe(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw  new ArithmeticException("Expected a non-zero second parameter");
        } else {
            return x/y;
        }
    }

    private static void getAge(int year) throws ValueException {
        final int currentYear = 2019, bestYear = 1970;

        if (year > currentYear) {
            throw new ValueException("invalid year, "
                    + year + ", greater than, "
                    + currentYear + ". enter a year less than "
                    + currentYear);
        } else if (year < bestYear) {
            throw new ValueException("invalid year, "
                    + year + ", less than , "
                    + bestYear + ". enter a year greater than "
                    + bestYear);
        } else {
            System.out.println("User age: " + (currentYear - year));
        }
    }
}
