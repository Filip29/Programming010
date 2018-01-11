package cas4;

import java.util.Scanner;

public class PitagorovaTeorema {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        int dalimozedaseformira = 1;
        System.out.println("Vnesi ja otseckata a");
        int a = citac.nextInt();
        System.out.println("Vnesi ja otseckata b");
        int b = citac.nextInt();
        System.out.println("Vnesi ja otseckata c");
        int c = citac.nextInt();
        System.out.println(dalimozedaseformira(a,b,c));


    }
    static boolean dalimozedaseformira (int a,int b,int c) {
        if ((a * a) + (b * b) == c * c) {
            return true;
        }
        return false;
    }


}

