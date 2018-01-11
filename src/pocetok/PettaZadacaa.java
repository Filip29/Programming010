package pocetok;

import java.util.Scanner;

public class PettaZadacaa {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi go agolot a");
        double a = citac.nextDouble();
        double b = 180 - 2*a;
        System.out.println("Agolot e " + b);

    }
}
