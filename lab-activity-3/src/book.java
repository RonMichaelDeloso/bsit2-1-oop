class Book {
    String title ="";
    String author = "";
    int pages = 0;
    boolean isAvailable = true;

    public Book(String titleName, String authorName, int Pages){
        title = titleName;
        author = authorName;
        pages = Pages;
        System.out.println(title + " " + " by " + author);
    }
    public void displayInfo(){
        if(title == "Heartstopper") {
            System.out.println("an ongoing graphic novel series by Alice Oseman about two British schoolboys, Charlie Spring and Nick Nelson, who develop a romantic relationship");
        }
        if(title == "Harry Potter and the Cursed Child") {
            System.out.println("focuses on the relationship between Harry Potter, now an overworked Ministry of Magic employee, and his youngest son, Albus Severus.");
        }
        if(title == "invisible man"){
            System.out.println("The story revolves around Brent Damien J. Cruz, a basketball player, and Maxine Theodora Alvarado, a volleyball player, exploring themes of unrequited love and perception");
        }
    }
    public void borrowBook(){
        isAvailable = false;
        System.out.println("This book " + title + " not availabe" );

    }
    public void returnBook(){
        isAvailable = true;
        System.out.println("This book " + title + " is Available");
    }


    public static void main(String[] args) {
        System.out.println();
        Book book1 = new Book("Heartstopper", "Alice Oseman", 288);
        book1.displayInfo();
        book1.borrowBook();


        System.out.println();
        Book book2 = new Book("Harry Potter and the Cursed Child", "Jack Thorne, J. K. Rowling ",327);
        book2.displayInfo();
        book2.returnBook();


        System.out.println();
        Book book3 = new Book("invisible man", "jonaxx", 300 );
        book3.displayInfo();
        book3.returnBook();

    }
}
