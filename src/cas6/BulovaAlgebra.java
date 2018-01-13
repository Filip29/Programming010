package cas6;

import java.util.Scanner;

public class BulovaAlgebra {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi trocifren broj");
        int n = citac.nextInt();
        if (n % 100 != 0) {
            System.exit(0);
        }
        presmetajSuma(n);
    }

    static void presmetajSuma(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 2 == 0 || i % 7 == 0) {
                System.out.println(i);
            }

        }
    }
}
