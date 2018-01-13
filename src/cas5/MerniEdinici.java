package cas5;

import java.util.Scanner;

public class MerniEdinici {
    public static void main(String[] args) {
        double m = 1000;
        double cm = 100000;
        double mm = 1000000;
        System.out.println("Vnesi broj vo kilometri");
        double km;
        Scanner citac = new Scanner(System.in);
        km=citac.nextDouble();
        double metar = km*m;
        System.out.println("meter:- " +metar);
        double santimetar = km*cm;
        System.out.println("santimetar:- " +santimetar);
        double milimetar = km*mm;
        System.out.println("milimetar:- " +milimetar);

    }
}
