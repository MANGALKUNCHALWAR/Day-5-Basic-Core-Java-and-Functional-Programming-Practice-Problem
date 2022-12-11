package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//8. Java Program to Check Whether a Number is Even or Odd.
public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
