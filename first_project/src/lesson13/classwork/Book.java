package lesson13.classwork;

public class Book extends Print implements Printable {

    // private int pages;


    public Book(int pages) {
        super(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                '}';
    }

    @Override
    public void printYouType() {
        System.out.println("I'm a book");
    }

    @Override
    public void howManyPages(int pages) {
        super.howManyPages(pages);
    }
}
