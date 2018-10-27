
package booktest;

/**
 *
 * @author Maxwell
 */
public class Book {
        //Author
        private String myAuthor;
        //Title
        private String myTitle;
        //Year Publish
        private int myYear;
        private int myNumberSold;
        
        
        //Default Constructor
        public Book() {
            myAuthor = "George R.R. Martin";
            myTitle = "Game of Thrones";
            myYear = 1996;
            myNumberSold = 0;
        }
        
        public Book(String author, String title, int year) {
            myAuthor = author;
            myTitle = title;
            myYear = year;
            myNumberSold = 0;
        }
        
        //Setter or Mutator Methods
        public void soldCopy() {
            myNumberSold++;
        }
        public void soldCopies(int numberSold) {
            myNumberSold = myNumberSold + numberSold;
        }
        
        //Getter or Accessor Methods
        public int getCopiesSold() {
            return myNumberSold;
        }
        
        //Print Method
        public void print(){
            System.out.println("Title: " + myTitle + " - " + "Author: " + myAuthor + " - " + 
                               "Year: " + myYear + " - " + "Number Sold: " + myNumberSold);
        }
}
