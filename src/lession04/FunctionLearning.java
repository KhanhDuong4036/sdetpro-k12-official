package lession04;

import java.security.SecureRandom;
import java.util.Scanner;

public class FunctionLearning {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing) {
            printGameMenu();
            int userOption = getUserOption();
            if (userOption == 0) {
                isContinuing = false;
            } else if (userOption == 1) {
                System.out.printf("Your random number is: %d\n", new SecureRandom().nextInt(5) + 1);

            } else {
                System.out.println("Input again");
            }
        }
        System.out.println("Good bye");
    }

    public static void printGameMenu() {
        System.out.println("==== GAME MENU ====");
        System.out.println("1. Generate random number");
        System.out.println("0. Exit!");
        System.out.print("Please enter your option: ");

    }

    public static int getUserOption() {
        System.out.print("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        int userOption = scanner.nextInt();
        return userOption;
    }
}
