package cas4;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class PronajdiNajgolem {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesejte broj a");
        int a = citac.nextInt();
        System.out.println("Vnesete broj b");
        int b = citac.nextInt();
        System.out.println("Vnesete broj c");
        int c = citac.nextInt();
        int najgolem = vratiPogolem(a, b, c);
        System.out.println("Najgolem e " +najgolem);

    }

    static int vratiPogolem(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }

        return 0;
    }
}
