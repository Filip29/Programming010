package pocetok;

import java.util.Scanner;

public class ZadacaSedum {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vie mi dadovte");
        double a = citac.nextDouble();
        System.out.println("Cenata e");
        double e = citac.nextDouble();
        System.out.println("Kolku zedovte pakovcinja");
        double b = citac.nextDouble();
        double c = 1;
        c = e * b;
        System.out.println("Iznosot na " + e + "i" + b + " e " + c);
        double d = 0;
        d = a - c;
        System.out.println("Treba da vi vratam od " + a + " i " + c + " , " + d);

    }
}
