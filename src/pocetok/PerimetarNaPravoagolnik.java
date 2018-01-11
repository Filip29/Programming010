package pocetok;

import java.util.Scanner;

public class PerimetarNaPravoagolnik {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja stranata a");
        int a = citac.nextInt();
        System.out.println("Vnesi ja stranata b");
        int b = citac.nextInt();
        int L = 0;
        L = 2 * a + 2 * b;
        System.out.println("Perimetarit na pravoagolnikot so strani" + a + " i " + b + " e " + L);
    }


}

