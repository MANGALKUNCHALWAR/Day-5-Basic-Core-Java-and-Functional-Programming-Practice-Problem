package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//7. Java Program to Swap Two Numbers.
public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //a=3
        int b = sc.nextInt(); //b=2
        int t;
        t = a; //t=3
        a = b; //a=2
        b = t; //b=3
        System.out.println("after swapping " + a + " " + b); //2,3
    }
}
