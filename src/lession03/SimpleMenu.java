package lession03;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("==== GAME MENU ====");
            System.out.println("1. Generate random number");
            System.out.println("0. Exit!");
            System.out.print("Please enter your option: ");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            if(userOption == 0){
                isContinuing = false;
            } else if (userOption == 1) {
                System.out.printf("Your random number is: %d\n", new SecureRandom().nextInt(5) + 1);
                
            }else {
                System.out.println("Input again");
            }
        }
        System.out.println("Good bye");
    }
}
