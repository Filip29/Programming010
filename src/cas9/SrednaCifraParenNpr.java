package cas9;

import java.util.Scanner;

public class SrednaCifraParenNpr {
    public static boolean daliSredenBrojEParen(int broj) {
        int sredenBroj = broj % 100 / 10;
        if (sredenBroj % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(daliSredenBrojEParen(365));

    }
}
