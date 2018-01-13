package cas5;

import java.util.Scanner;

public class ProstBroj {
    public static void main(String[] args) {
        int PomosnaVarijabla;
        boolean eProst = true;
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int n = citac.nextInt();
        citac.close();
        for (int i = 2; i <= n / 2; i++) {
            PomosnaVarijabla = n % i;
            if (PomosnaVarijabla == 0) {
                eProst = false;
                break;
            }
        }
        if (eProst) {
            System.out.println(n + " E prost broj");
        } else {
            System.out.println(n  + " Ne e prost broj");
        }
    }
}
