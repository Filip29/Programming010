package cas6;

import java.util.Scanner;

public class BrojDen {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj od 1 do 7");
        int den = citac.nextInt();
        System.out.println(ImetoNaDenot(den));
    }

    public static String ImetoNaDenot(int den) {
        String imeNaDen = "";
        switch (den) {
            case 1:
                imeNaDen = "Ponedelnik";
                break;
            case 2:
                imeNaDen = "Vtornik";
                break;
            case 3:
                imeNaDen = "Sreda";
                break;
            case 4:
                imeNaDen = "Cetvrtok";
                break;
            case 5:
                imeNaDen = "Petok";
                break;
            case 6:
                imeNaDen = "Sabota";
                break;
            case 7:
                imeNaDen = "Nedela";
                break;
            default:
                imeNaDen = "Ne e validen";
        }
        return imeNaDen;

    }
}
