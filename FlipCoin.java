package assignment.Day5BasicCoreJava;

import java.util.Random;
import java.util.Scanner;
//1. Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//c. O/P -> Percentage of Head vs Tails
public class FlipCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number you want to flip the coin :");
        int totalFlip=scan.nextInt();
        int tailflip = 0;
        int headflip = 0;
        Random random = new Random();
        if (totalFlip > 0) {
            for (int i = 0; i < totalFlip; i++) {
                float flip = random.nextFloat();
                if (flip < 0.5) {
                    tailflip = tailflip + 1;
                } else {
                    headflip = headflip + 1;
                }
            }
            System.out.println("tail  percentage is : " +(tailflip*100)/totalFlip);
            System.out.println("head  percentage is : " +(headflip*100)/totalFlip);

            //%=(nub*100)/total
        } else {
            System.out.println(" please enter a Positive value");
        }
    }
}
