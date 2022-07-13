package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("엥");
        shelfQueue.enQueue("엥엥");
        shelfQueue.enQueue("엥엥엥");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}