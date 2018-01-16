package cas9;

import java.util.Scanner;

public class Dali2NiziSeIsti {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};
        int[] b = {3, 4, 5, 6, 7, 8};
        int[] c = {3, 2, 5, 4, 7, 8};
        System.out.println(daliSeEdnakviNizite(a,c));
    }

    public static boolean daliSeEdnakviNizite(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }

        }
        return true;
    }
}

