package MoreOnClasses;

public class JavaMethodOverLoading {

    public int max(int x, int y) {
        return Math.max(x, y);
    }

    public double max(double x, double y) {
        return Math.max(x, y);
    }

    public String max(String x, String y) {
        int lengthX, lengthY;
        lengthX = x.length();
        lengthY = y.length();

        String returnStatement = "";

        if (lengthX > lengthY) {
            returnStatement = x;
        }

        if (lengthY > lengthX) {
            returnStatement = y;
        }

        return  returnStatement;
    }
}
