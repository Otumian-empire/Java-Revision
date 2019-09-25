package ArraysInJava;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // MultiDimensionalArrays
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] i : list) {
            for (int x : i) {
                System.out.println(x);
            }
        }
    }
}
