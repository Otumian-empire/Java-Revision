package MoreOnClasses;

public class MainClass {
    public static void main(String[] args) {
        // encapsulation in Java - Data hiding
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
        System.out.println("The max int is " + methodOverLoading.max(1, 3));
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
        System.out.println((double) 3 / 5);


        // Anonymous classes
        JavaPolymorphism anonymousPolymorphism;
        anonymousPolymorphism = new JavaPolymorphism("Sandra Omani", 8765) {
            @Override
            public void displayDetails() {
                System.out.println("This is an anonymous class");
                System.out.println("My name is " + this.getName());
                System.out.println("and my number is " + this.getNumber());
            }
        };

        anonymousPolymorphism.displayDetails();
    }
}
