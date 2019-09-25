package BasicConcepts;

public class StringsInJava {
    public static void main(String[] args) {
        String name = "John Doe";
        String sentence = "My full name is " + name;
        System.out.println(sentence);

        String firstName, lastName;
        char firstNameInit, lastNameInit;

        firstName = "Daniel";
        lastName = "Cpu";
        firstNameInit = 'D';
        lastNameInit = 'C';

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("They have the initials, " + firstNameInit + " and " + lastNameInit);
    }
}
