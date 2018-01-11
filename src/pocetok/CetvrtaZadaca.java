package pocetok;

import java.util.Scanner;

public class CetvrtaZadaca {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja stranata a");
        double a = citac.nextDouble();
        double P = 1;
        P = a * a;
        System.out.println("Plostinata na kvadrat so strana " + a + " e " + P);
        double L = 0;
        L = a * 4;
        System.out.println("Plostinata na kvadrat so strana " + a + " e " + L);

    }
}
