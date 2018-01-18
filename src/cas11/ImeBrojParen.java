package cas11;

import java.util.Scanner;

public class ImeBrojParen {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ime");
        String n = citac.nextLine();
        String str = n;
        char[] karakteriOdIme = str.toCharArray();
        for (int i = 0; i < karakteriOdIme.length ; i++) {
            if (i%2==0){
                System.out.println(karakteriOdIme[i]);
            }
        }
    }
}
