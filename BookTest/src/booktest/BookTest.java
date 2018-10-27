package booktest;

/**
 *
 * @author Maxwell
 */
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book theBook = new Book();
        theBook.soldCopy();
        theBook.soldCopy();
        theBook.print();
        
        int sold = theBook.getCopiesSold();
        
        Book theOtherBook = new Book("Dr. Seuss", "Go Dog Go", 1954);
        theOtherBook.print();
    }
    
}
