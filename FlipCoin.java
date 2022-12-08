package assignment.Day5BasicCoreJava;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int num = 10;
        int tail = 0;
        int head = 0;
        Random random = new Random();
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                float b = random.nextFloat();
                if (b < 0.5) {
                    tail = tail + 1;
                } else {
                    head = head + 1;
                }
            }
            System.out.println("tail " +(tail*100)/num);
            System.out.println("head " +(head*100)/num);

            //%=(nub*100)/total
        } else {
            System.out.println("negative");
        }
    }
}
