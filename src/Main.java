import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalnumber = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("enter number: " + i + ": ");
            int number = scanner.nextInt();
            totalnumber += number;
        }
        System.out.println("total number: " + totalnumber);
    }
}