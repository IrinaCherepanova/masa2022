package lesson12.defaultPackage;

public class DefaultMain {

    public static void main(String[] args) {

        DefaultClass defaultClass = new DefaultClass();
        System.out.println("defaultClass.name = " + defaultClass.name);
        defaultClass.name = "Ira";
        System.out.println("defaultClass.name = " + defaultClass.name);
    }
}
