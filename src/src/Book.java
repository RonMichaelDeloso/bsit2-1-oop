class Book extends LibraryItem implements Borrowable{
    private String isbn;
    private int numberOfPages;
    private String genre;

 public Book(String itemId, String Title, String author, String borrowName, String isbn, int numberOfPages, String genre){
     super(itemId, Title, author, borrowName);
     this.isbn = isbn;
     this.numberOfPages = numberOfPages;
     this.genre = genre;
 }


    @Override
    public void getItemType(){
     return ;
    }

    @Override
    public void calculateLateFee(int daysLate){

    }
}
