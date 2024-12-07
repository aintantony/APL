package chapterone;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!");
        System.out.println("This is year 2 student");
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("You are " + name);

    }
}
