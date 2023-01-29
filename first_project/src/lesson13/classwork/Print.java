package lesson13.classwork;

public abstract class Print implements Printable {

    int pages;

    public Print(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Print{" +
                "pages=" + pages +
                '}';
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void printYouType() {

    }

    @Override
    public void howManyPages(int pages) {
        Printable.super.howManyPages(pages);
    }
}
