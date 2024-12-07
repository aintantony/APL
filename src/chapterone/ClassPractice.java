package chapterone;

import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAY = 365;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int bornDay = DAY * age;

        System.out.println("Hello my name is " + name + " and I have been born for " + bornDay + " days.");

        scanner.close();
    }

}
