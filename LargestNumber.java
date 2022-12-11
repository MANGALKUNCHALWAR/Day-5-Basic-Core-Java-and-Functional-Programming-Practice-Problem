package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//10. Java Program to Find the Largest Among Three Numbers
public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("a is Largest");
            } else {
                System.out.println("c is Largest");
            }
        } else {
            if (b > c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is Largest");
            }
        }
    }
}
