import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;

    private static int totalBooks = 0;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void addRating(int rating){
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("invalid rating must be 1 - 5 stars");
        }
        ratings.add(rating);
    }

    public double getAverageRating(){
        int totalRating = 0;
        for (Integer rating : ratings){
            totalRating += rating;
        }
        double average = totalRating / ratings.size();
        return average;
    }

    public String getPopularityLevel(double averageRating) {
        if (averageRating >= 4.5) {
            return "Excellent";
        }
        if (averageRating >= 3.5) {
            return "Good";
        }
        if (averageRating >= 2.5) {
            return "Average";
        }
        if (averageRating >= 1.5) {
            return "Poor";
        }
        if (averageRating >= 1.0) {
            return "Terrible";
        }
        return "no rating";
    }

    public void addMultipleRatings(int... ratings){
        for (int rating: ratings){

        }
    }

    public static int getTotalBooks(){
        return  totalBooks;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String displayBook(){
        return "Book: " + title + "by" + author +", Average Rating: " + getAverageRating() +", Level: " + getAverageRating();
    }

}
