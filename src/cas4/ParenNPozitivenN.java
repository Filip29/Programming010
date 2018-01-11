package cas4;

import java.util.Scanner;

public class ParenNPozitivenN {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        int n;
        System.out.println("Vnesi cel broj");
        n = citac.nextInt();
        if (n % 2 == 0) {
            System.out.println("Brojot e paren");
        } else {
            System.out.println("Brojot e neparen");
        }
         if (n > 0) {
            System.out.println("Brojot e pozitiven");
        } else {
            System.out.println("Brojot e negativen");
        }

    }
}
