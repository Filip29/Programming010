package cas3;

import java.util.Scanner;

public class FunkciiOdzemanjeMnozenjeSobiranjeDelenje {

    static int solveMeFirst(int a, int b) {
        int s = a + b;
        return s;

    }
    static int odzemanje (int a, int b){
        if (a>b){
            return a-b;
            }else {
            return b-a;
        }
    }
    static int mnozenje (int a, int b){
        return a*b;
    }
    static double delenje (int a, int b){
        if (a>b){
            return a/b;
        }else {
            return b/a;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
        int proizvod;
        proizvod = mnozenje (a,b);
        System.out.println(proizvod);
        double delenje;
        delenje = delenje (a,b);
        System.out.println(delenje);
        int odzemanje;
        odzemanje = odzemanje (a,b);
        System.out.println(odzemanje);
    }
}
