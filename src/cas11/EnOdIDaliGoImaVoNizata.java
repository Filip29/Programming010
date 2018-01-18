package cas11;

import java.util.Scanner;

public class EnOdIDaliGoImaVoNizata {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi 3 broja");
        int[] n = {1, 2, 3, 4, 5};
        int a = citac.nextInt();
        int b = citac.nextInt();
        int c = citac.nextInt();
        daliGoImaVoNizata(a, b, c, n);
    }

    public static void daliGoImaVoNizata(int a, int b, int c, int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (a == n[i]) {
                System.out.println("go ima");
            }
            if (b == n[i]) {
                System.out.println("go ima");
            }
            if (c == n[i]) {
                System.out.println("go ima");
            }
        }
    }
}
//brojkata vo nizata sho ja izminuvas za sekoja pozicija