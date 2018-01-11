package cas2;

import java.util.Scanner;

public class Zadaca3 {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi paren broj");
        double a = citac.nextDouble();
        if (a % 2 != 0 || (a + 3) % 2 == 0) {
            System.out.println("Brojot e magicen");
        } else {
            System.out.println("Ne e magicen");

        }
    }
}
