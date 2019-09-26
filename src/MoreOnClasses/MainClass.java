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
    }
}
