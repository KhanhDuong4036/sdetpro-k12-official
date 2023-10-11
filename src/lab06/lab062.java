package lab06;

import java.util.Scanner;

public class lab062 {
    public static void main(String[] args) {
        String password = "password123";
        boolean incorrectPassword = true;
        int inputTime = 0;
        while (incorrectPassword && inputTime < 3) {
            System.out.print("Please input your password: ");
            Scanner scanner = new Scanner(System.in);
            String inputPassword = scanner.next();
            if (password.equals(inputPassword)) {
                System.out.println("Login Successfully");
                incorrectPassword = false;
            } else {
                inputTime++;
                System.out.println("Wrong password");
                if (inputTime == 3) {
                    System.out.println("Thank you!");
                }
            }
        }
    }
}
