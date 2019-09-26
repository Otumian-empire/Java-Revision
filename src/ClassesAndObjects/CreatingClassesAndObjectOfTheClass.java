package ClassesAndObjects;

public class CreatingClassesAndObjectOfTheClass {
    public static void main(String[] args) {
        Language pythonLanguage = new Language();
        pythonLanguage.setName("Python");

        String name = pythonLanguage.getName();
        System.out.println("The name of the language is " + name);

        Language englishLanguage = new Language();
        englishLanguage.setName("English");

        System.out.println("The name if the language is " + englishLanguage.getName());
    }
}

class Language {
    private String name = "";

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}