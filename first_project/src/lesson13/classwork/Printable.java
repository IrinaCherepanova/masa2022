package lesson13.classwork;

public interface Printable {
    void printYouType();

    default void howManyPages(int pages){
        System.out.println("I have " + pages + " pages");
    }

}
