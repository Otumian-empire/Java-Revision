package MoreOnClasses;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class MainClass {
    public static void main(String[] args) {
        /*// encapsulation in Java - Data hiding
        JavaEncapsulation javaEncapsulation;
        javaEncapsulation = new JavaEncapsulation("John Doe", 12345);
        String name = javaEncapsulation.getName();
        int number = javaEncapsulation.getNumber();
        System.out.println("number " + number + "\nname: " + name);

        // inheritance in java - extending the functionality of one class by another
        JavaInheritance javaInheritance;
        javaInheritance = new JavaInheritance("Samuel Doe", 3214);
        javaInheritance.displayDetails();

        // polymorphism in java
        JavaPolymorphism javaPolymorphism;
        javaPolymorphism = new JavaPolymorphism("Sandra Omari", 8765);
        javaPolymorphism.displayDetails();

        // method overloading
        JavaMethodOverLoading methodOverLoading;
        methodOverLoading = new JavaMethodOverLoading();
        System.out.println("The max int is " + methodOverLoading.max(1,3));
        System.out.println("The max double is " + methodOverLoading.max(1.0, 3.0));
        System.out.println("The longest word here is " + methodOverLoading
                .max("hello world", "I am a programmer"));

        // abstraction of classes and methods
        ExtendingJavaAbstractClass aClass = new ExtendingJavaAbstractClass();
        aClass.setName("John Doe");
        System.out.println(
                "My name is " + aClass.getName() + " and i am " + aClass.dateOfBirth(1987));

        // implementing an interface
        ImplementingAnInterface anInterface = new ImplementingAnInterface();
        anInterface.sayHello();
        anInterface.sayHi();

        // casting
        System.out.println((double) 3/5);


        // Anonymous classes
        JavaPolymorphism javaPolymorphism;
        javaPolymorphism = new JavaPolymorphism("Sandra Omani", 8765) {
            @Override
            public void displayDetails() {
                System.out.println("This is an anonymous class");
                System.out.println("My name is " + this.getName());
                System.out.println("and my number is " + this.getNumber());
            }
        };

        javaPolymorphism.displayDetails();

        // Exception handling
        try {
            int x = 12, y = 0;
            System.out.println(Math.floorDiv(x, y));
        } catch (Exception e) {
            System.out.println("Can not divide by Zero");
        }

        try {
            int[] list = {1,3};
            System.out.println(list[2]);
        } catch (Exception e) {
            System.out.println("There is an error");
        }

         this line was meant to crash actually
         System.out.println(1/0);

        try {
            getAge(23);
        } catch (Exception e) {
            System.out.println("There is an error for 23");
        }

        try{
            getAge(2019);
        } catch (Exception e) {
            System.out.println("There is an error for 2019");
        }

        try{getAge(1996);} catch(Exception ignored){}

        try {System.out.println(divideMe(23, 9));} catch (ArithmeticException ignored) {}
        try{System.out.println(divideMe(23, 0));}catch (ArithmeticException ignored){}

         */



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
