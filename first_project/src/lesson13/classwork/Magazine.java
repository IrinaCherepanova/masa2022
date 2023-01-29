package lesson13.classwork;

public class Magazine extends Print implements Printable {

    //int pages;

    public Magazine(int pages, int pages1) {
        super(pages);
        this.pages = pages1;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "pages=" + pages +
                '}';
    }

    @Override
    public void printYouType() {
        System.out.println("I'm a magazine");
    }

    public Magazine(int pages) {
        super(pages);
    }

    @Override
    public void howManyPages(int pages) {
        super.howManyPages(pages);
    }
}
