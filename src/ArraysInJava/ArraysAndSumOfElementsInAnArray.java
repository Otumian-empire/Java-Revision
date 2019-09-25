package ArraysInJava;

public class ArraysAndSumOfElementsInAnArray {
    public static void main(String[] args) {
        // array declaration

        // type[] identifier = new type[size]
        int [] intArray = new int[5];

        for (int i = 0; i < 5; i++) {
            intArray[i] = (i * 5) / 2;
        }

        intArray[0] = -1 * intArray[0];

        for (int x = 0; x < 5; x++) {
            System.out.println("intArray[" + (x + 1) + "] = " + intArray[x]);
        }

        // initializing arrays
        String[] nameOfItem = {"Shoe", "socks", "slack"};

        // enhanced for loop (also know as the for each loop
        /*for (type identifier: array) {
            do something
        }*/

        for (String value : nameOfItem) {
            System.out.println(value);
        }

        for (String s: nameOfItem) {
            System.out.println(s);
        }

        int sum = 0;
        for (int i: intArray) {
            sum += i;
        }

        System.out.println("The sum of all the elements in the array is " + sum);
    }
}
