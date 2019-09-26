package ClassesAndObjects;

public class AClassAndAMethod {

    private static void sayHi() {
        System.out.println("Hi");
    }

    private static void greet(String name) {
        System.out.println("Hello " + name);
    }

    private static int getAge(int yearOfBirth) {
        return 2019 - yearOfBirth;
    }

    public static void main(String[] args) {
        // calling the function above
        sayHi();

        // calling sayHi multiple times
        sayHi();
        sayHi();
        sayHi();

        // calling greet and passing an argument
        greet("Nicolas");
        greet("John Doe");

        // calculating the user age
        int age = getAge(1987);
        System.out.println("I am " + age + " years old");

    }
}
