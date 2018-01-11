package pocetok;

import java.util.Scanner;

public class TretaZadaca {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi go radiusot r");
        double r = citac.nextDouble();
        System.out.println("Vnesi go U");
        double U = citac.nextDouble();
        double P = 1;
        P = r * r * U;
        System.out.println("Plostinata na krug so radius" + r + "i" + U + " e " + P);
    }
}
