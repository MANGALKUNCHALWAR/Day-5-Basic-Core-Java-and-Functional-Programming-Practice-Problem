package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//5. Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.
public class PrimeFactor {
    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N=4 (1,2,4)

        for (int i = 1; i <= N; i++) {  //i=1;i<=4==> con. true till the i<=4
            if (N % i == 0) {  //4%1=0 , 4%2=0 , 4%3=1 false if terminate 4%4=0
                System.out.println(i + " "); //1,2,4
            }
        }
    }
}

