package cas4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class dssada {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi dva broja i soodvetna operacija so koja sakas da se izvrsi zadacata");
        System.out.println("Vnesi ja a");
        int a = citac.nextInt();
        System.out.println("Vnesi ja b");
        int b = citac.nextInt();
        System.out.println("Vnesi ja operacijata");
        String znak = citac.next();

        int res = znak(a, b, znak.charAt(0));
        System.out.println(res);
    }

    static int znak(int a, int b, char znak) {
        int rezultat = 1;

        switch (znak) {
            case '+':
                rezultat = a + b;
                break;
            case '-':
                rezultat = a - b;
                break;
            case '/':
                rezultat = a / b;
                break;
            case '*':
                rezultat = a * b;
                break;
            default:
                System.out.println("Vlezot e neregularen");
        }
        return rezultat;
    }
}
