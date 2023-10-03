package lession04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * Allow user to have 3 guesses from 0-9
         * If: matched -> Horray
         * Else: good luck
         * */
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(10);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your number: ");
            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Horray");
                break;
            }
            guessingTime++;
        } while (guessingTime < 3);
        if (guessingTime == 3) {
            System.out.println("Good Luck!!!");
        }
    }
}
