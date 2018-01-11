package cas4;

import java.util.Scanner;

public class OcenkaCase {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);

        System.out.println("Vnesi ocenka od 1 do 5");
        int ocenka =citac.nextInt();
        switch (ocenka){
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("B");
                break;
            case 5:
                System.out.println("A");
                break;
            default:
                System.out.println("Vasata ocenka ne e regularna");
        }





    }

}



