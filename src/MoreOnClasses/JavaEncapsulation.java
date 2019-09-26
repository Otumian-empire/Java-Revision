package MoreOnClasses;

class JavaEncapsulation {

    private String name = "";
    private int number = 0;

    public JavaEncapsulation(String name , int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
