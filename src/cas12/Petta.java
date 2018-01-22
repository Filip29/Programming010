package cas12;

import java.util.Scanner;

public class Petta {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int n = citac.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}


