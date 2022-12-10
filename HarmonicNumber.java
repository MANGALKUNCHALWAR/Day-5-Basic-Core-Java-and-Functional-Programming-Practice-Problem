package assignment.Day5BasicCoreJava;

import java.util.Scanner;

//4. Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.
//ex: H1=1, H2=H1+1/2, H3=H2+1/3.....Hn=Hn-1+1/n
// in this step creating one Class name as Harmonic Number
public class HarmonicNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner n = new Scanner(System.in);
        int num = n.nextInt(); // // in this step creating one int variable to store the I/P
        //in this step creating one more double variable to store the output.
        double result = 0.0;

        while (num != 0) { // in this step creating one while loop for num is greater than 0
            result = result + (double) 1 / num;

            num--;
            System.out.println(result + " ,");//in this step creating logic for getting the output.

        }
    }
}

/////***OR***/////

class HarmonicNo {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        double result = 0.0;

        for (int i = num; i > 0; i--) {
            result = result + (double) 1 / i;
            System.out.println(result + " ,");

        }

    }
}




