package ie.gmit;

import java.util.Scanner;
// This method will add two numbers
// And Subtract two numbers
public class Calculator {

    public static void main(String[] args) {

        int num1, num2, sum, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        sub = num1 - num2;
        System.out.println("Sum of these numbers: "+sum);
        System.out.println("Subtraction of these numbers: "+sub);
    }
}
