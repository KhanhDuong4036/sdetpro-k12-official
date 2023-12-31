package lab02;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Please input your weight (m): ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * 2);
        if (bmi <= 18.5) {
            System.out.printf("BMI is %.2f --> Underweight\n", bmi);
        } else if (bmi < 25) {
            System.out.printf("BMI is %.2f ---> Normal weight\n", bmi);
        } else if (bmi < 30) {
            System.out.printf("BMI is %.2f ---> Overweight\n", bmi);
        } else {
            System.out.printf("BMI is %.2f ---> Obesity\n", bmi);
        }

    }
}
