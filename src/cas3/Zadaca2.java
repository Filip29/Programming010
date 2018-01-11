package cas3;

import java.util.Scanner;

public class Zadaca2 {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int sum = 0;
        int n = citac.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }
}
