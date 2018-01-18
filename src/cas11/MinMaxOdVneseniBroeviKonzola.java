package cas11;

import java.util.Scanner;

public class MinMaxOdVneseniBroeviKonzola {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja a");
        int a=citac.nextInt();
        System.out.println("Vnesi ja b");
        int b=citac.nextInt();
        System.out.println("Vnesi ja c");
        int c=citac.nextInt();
        if (a>b&&a>c){
            max = a;
        }if (b>a&&b>c){
            max = b;
        }if (c>a&&c>b){
            max = c;
        }if (a<b&&a<b){
            min = a;
        }if (b<a&&b<c){
           min = b;
        }if (c<a&&c<b){
            min = c;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
