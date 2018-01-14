package cas7;

import java.util.Arrays;
import java.util.Scanner;

public class DaliEVoNizata {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int Num = input.nextInt();

        int[] value = { 1,2,3,4,5,6,7 };

        int i = 0;

        for (i = 0; i < value.length; i++) {
            if (value[i] == Num) {
                System.out.print("\nYes, "+Num+" is in this array.");
                break;
            }
        } if ((value.length) - i == 0) {
            System.out.print("\nNo, "+Num+" is not in this array.");
        }
    }
}