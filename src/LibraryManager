import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryManager {
    ArrayList<String> books = new ArrayList<>(Arrays.asList("Java Programming", "Web Development", "DataBases Design"));

    Scanner scanner = new Scanner(System.in);

    public void showBooks(){
        try {
            if (books == null) {
                throw new IllegalArgumentException("Book list in not initialized!");
            }
            System.out.println("--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("Currently no books available in the library.");
            }else{
                for (int i = 0; i < books.size(); i++){
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }

    }
    public void addBook(){
        try {
           System.out.println("\nEnter book title to add: ");
           String title = scanner.nextLine().trim();

            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty");
            }
            if (title.length() < 3){
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");

            }

            books.add(title);
            System.out.println("book: '" + title + "' added successfully");
        } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
        } finally {
                System.out.println("Add book operation completed.");
            }
            }
    public void removeBook(){
        try {
            if (books.isEmpty()) {
                System.out.println("\nNo books available to remove");
                return;
            }
            System.out.println("\nEnter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();

            int index;

            try {
                index = Integer.parseInt(input) - 1;
            } catch (NumberFormatException e){
                System.out.println("Error: Please enter a valid Number!");
                return;
            }

            if (index < 0) {
                throw new IllegalArgumentException("Book number cannot be negative!");
            }
            if (index >= books.size()){
                throw new ArrayIndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index);
            System.out.println("Book '" + removedBook + "removed successfully!");

        }catch (ArrayIndexOutOfBoundsException| IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Remove book operation completed.");
        }
    }
    }
