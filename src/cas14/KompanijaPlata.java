package cas14;

import java.util.Scanner;

public class KompanijaPlata {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Ime");
        String ime = citac.nextLine();
        System.out.println("Rabotna pozicija");
        String rp = citac.nextLine();
        System.out.println("Plata");
        int pl = citac.nextInt();
        System.out.println(primanjeplata(ime, rp, pl));

    }

    public static String primanjeplata(String ime, String rp, int pl) {
        if (rp.equalsIgnoreCase("Tester")){
            if (pl>30000){
                double pokacenaplata = pl + pl*0.25;
                return " " + ime + pokacenaplata;
            }else if (pl<30000){
                double pokacenaplata = pl + pl*0.30;
                return " " + ime + pokacenaplata;
            }
        }
        if (rp.equalsIgnoreCase("Programer")){
            if (pl>30000){
                double pokacenaplata = pl + pl*0.30;
                return " " + ime + pokacenaplata;
            }else if (pl<3000){
                double pokacenaplata = pl + pl*0.40;
                return " " + ime + pokacenaplata;
            }
        }
        if (rp.equalsIgnoreCase("Menadzer")){
            if (pl>30000){
                double pokacenaplata = pl + pl*0.30;
                return " " + ime + pokacenaplata;
            }else if (pl<30000){
                double pokacenaplata = pl + pl*0.45;
                return " " + ime + pokacenaplata;
            }

        }
        return " ";
    }
}

