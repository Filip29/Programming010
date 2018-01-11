package cas2.ciklusi;

import java.util.Scanner;

public class Zadaca1 {
    public static void main(String[] args) {
        int proizvod = 1;
        int sum =0;

        for (int i = 1; i <= 5; i++) {
            proizvod *= i;
        }
        System.out.println(proizvod);

        int j=0;
        while (j <= 5){
            sum+=j;
            j++;
        }
    }
}
