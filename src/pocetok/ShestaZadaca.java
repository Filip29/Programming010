package pocetok;

import java.util.Scanner;

public class ShestaZadaca {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja a");
        double a = citac.nextDouble();
        System.out.println("Vnesi ja b");
        double b = citac.nextDouble();
        double Y=1;
        Y= (a * a) - 2 * a * b + (b*b);
        System.out.println("Linearnata ravenka so " + a + " i " + b + " e " +Y);
    }
}
