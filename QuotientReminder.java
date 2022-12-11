package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//6. Java Program to Compute Quotient and Remainder
public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient=" + quotient);
        System.out.println("Remainder=" + remainder);
    }

}
