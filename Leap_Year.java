package assignment.Day5BasicCoreJava;

import java.util.Scanner;
//2. Leap Year
//a. I/P -> Year, ensure it is a 4-digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.
public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println( "enter a year");
        int year = scanner.nextInt();
        if(year%4==0){
            System.out.println( "year is leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}
