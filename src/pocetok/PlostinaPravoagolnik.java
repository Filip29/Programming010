package pocetok;

import java.util.Scanner;

public class PlostinaPravoagolnik {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja stranata a");
        double a = citac.nextDouble();
        System.out.println("Vnesi ja stranata b");
        double b = citac.nextDouble();
        double P = 1;
        P = a * b;
        System.out.println("Plostinata na pravoagolnik so strani " + a + " i " + b + " e " + P);
    }
}
