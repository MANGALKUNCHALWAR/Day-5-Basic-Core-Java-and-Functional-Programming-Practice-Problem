package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//9. Java Program to Check Whether an Alphabet is Vowel or Consonant
public class VovelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char alphabet = sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + "is a vovel");
        } else {
            System.out.println("is consonant");
        }

    }
}

