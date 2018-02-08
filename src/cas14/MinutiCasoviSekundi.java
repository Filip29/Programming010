package cas14;

import java.util.Scanner;

public class MinutiCasoviSekundi {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi minuti");
        int sec = citac.nextInt();
        int cas = sec / 3600;
        int min = sec / 60-(cas*60);
        int sek = sec - (min * 60) - (cas*3600);
        System.out.println(cas + " casovi");
        System.out.println(min + " minuti");
        System.out.println(sek + " sekundi");


    }
}
