abstract class LibraryItem {
    protected String itemId;
    protected String Title;
    protected String author;
    protected boolean isCheckedOut;
    protected String  borrowName;

    public LibraryItem(String itemId, String Title, String author, String borrowName){
        this.itemId = itemId;
        this.Title = Title;
        this.author = author;
        this.isCheckedOut = false;

    }

    public void getItemType(){

    }

    public void checkOut(String borrowName){
        isCheckedOut = false;
    }

    public void checkIn(int daysLate){
        isCheckedOut = true;
    }

    public void getItemType();

    public void calculateLateFee(int daysLate);



}
