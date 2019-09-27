package MoreOnClasses;

public class ExtendingJavaAbstractClass extends JavaAbstractClass {
    private String name;

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    int dateOfBirth(int year) {
        return 2019 - year;
    }
}
