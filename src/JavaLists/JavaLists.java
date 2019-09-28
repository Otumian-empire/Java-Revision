package JavaLists;

import java.util.ArrayList;

public class JavaLists {

    public static void main(String[] args) {
        // defining an arrayList
        // An arrayList stores Objects - meaning you can't pass a primitive type to it
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        ArrayList<Double> scores = new ArrayList<Double>(6);

        // adding to arrayList
        names.add("John");
        names.add("doe");
        names.add("Will turner");

        System.out.println(names);
        names.remove("Doe".toLowerCase());

        System.out.println(names);

        /* get, contains, size, clear, indexOf, isEmpty*/

        String name0 = names.get(0);
        String name1 = names.get(1);
        System.out.println("name0 is" + name0 + " and name1 is " + name1);

        if (names.contains("John")) {
            int indexOfJohn = names.indexOf("John");
            System.out.println("The index of John is " + indexOfJohn);
        } else {
            System.out.println("No object, John, in " + names);
        }

    }
}
