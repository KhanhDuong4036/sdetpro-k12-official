package lab02;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is an even number");
        } else {
            System.out.println("Your number is an odd number");
        }
    }
}
