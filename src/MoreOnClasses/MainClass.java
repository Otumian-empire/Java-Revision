package MoreOnClasses;

public class MainClass {
    public static void main(String[] args) {
        // encapsulation in Java - Data hiding
        JavaEncapsulation javaEncapsulation;
        javaEncapsulation = new JavaEncapsulation("John Doe", 12345);
        String name = javaEncapsulation.getName();
        int number = javaEncapsulation.getNumber();
        System.out.println("number " + number + "\nname: " + name);


    }
}
