package assignment.Day5BasicCoreJava;

import java.util.Scanner;
//3. Power of 2
//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//d. O/P -> Print the year is a Leap Year or not.
public class PowerOfTwo {
    public static void main(String[] args) {
        int a=2,N, i, mult = 1;  //N=3
        System.out.println("Enter number to power");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //N=5 => 2*2*2=8

        if (a >= 0 && a < 31) {

            for (i = 1; i <= N; i++) { //till the N =3 //i=1<=3 is true; i=2<=3 is true
               // System.out.println( i +"Power of 2^N " + 2 + " = " + i * 2);
                System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));//i=4
                mult = mult * a; //mult=1*2=2=>mult=2; //mult=2*2=4
            }

            System.out.println("power is" + mult); //mult =8
        } else {
            System.out.println("invalid no");
        }

    }
}



