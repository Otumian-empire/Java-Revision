package MoreOnClasses;

public class JavaPolymorphism  extends JavaInheritance {

    // basically having many forms
    // implementing different functionality for the same method
    // through inheritance by difference objects of the super class

    JavaPolymorphism(String name, int number) {
        super(name, number);
    }

    @Override
    public void displayDetails() {
        System.out.println("My name is " + super.getName());
        System.out.println("My age is " + super.getNumber());
    }
}
