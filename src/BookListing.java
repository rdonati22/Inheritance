public class BookListing {

    private double price;
    private Book story;

    public BookListing(Book b, double p){
        story = b;
        price = p;
    }

    public void printDescription(){
        story.printBookInfo();
        System.out.print(", $" + price);
    }
}
