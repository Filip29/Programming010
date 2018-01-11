package cas2;

import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj vo konzola");
        double a = citac.nextDouble();
        if(a%2==0){
            System.out.println("Brojot e paren");
        }else if (a%2!=0 ){
            System.out.println("Brojot e neparen");
        }else{
            System.out.println("Ne vnesovte broj");
        }

    }
}
