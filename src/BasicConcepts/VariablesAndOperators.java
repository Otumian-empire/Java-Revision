package BasicConcepts;

public class VariablesAndOperators {
    public static void main(String[] args) {
        /* Variables */
        int age = 30;
        String name = "John Doe";
        System.out.println("My name is " + name + " and I am " + age + " years old");

        /* operators */
        int x = 10, y = 20, z = -2;
        System.out.println("Add - " + (x + y));
        System.out.println("Minus - " + (x - y));
        System.out.println("Times - " + (x * y));
        System.out.println("Divide - " + (x / y));
        System.out.println("Modulo - " + (x % y));

        /* increment and decrement */
        System.out.println(x + " + 1 is the same as " + (++x));
        System.out.println(x + " - 1 is the same as " + (--x));
    }
}
