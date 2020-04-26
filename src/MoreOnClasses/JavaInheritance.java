package MoreOnClasses;

public class JavaInheritance extends JavaEncapsulation{
    // constructor matching JavaEncapsulation
    public JavaInheritance(String name, int number) {
        super(name, number);
    }

    public void displayDetails() {
        System.out.println("Name: " + super.getName() + "\nnumber: " + super.getNumber());
    }
}
