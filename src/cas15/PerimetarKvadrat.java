package cas15;

import java.util.Scanner;

public class PerimetarKvadrat {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi ja prvata strana a");
        int a = citac.nextInt();
        System.out.println("Vnesi ja vtorata strana b");
        int b = citac.nextInt();
        System.out.println("Vnesi ja tretata strana c");
        int c = citac.nextInt();
        System.out.println("Vnesi ja stranata na kvadratot n");
        int n = citac.nextInt();
        int L1 = a+b+c;
        int L2 = 4*n;
        if (L1>L2){
            System.out.println("Triagolnik");
        } if (L2>L1){
            System.out.println("Kvadrat");
        } if (L1==L2){
            System.out.println("Isti se");
        }
    }
}
