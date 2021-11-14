package com.company; import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ile sztuk towaru: ");
        int ileSztuk = sc.nextInt();
        sc.nextLine();
        double cena = 10;

        System.out.print("Czy jest promocja (Tak/Nie): ");
        boolean czyPromocja = sc.nextLine().equals("Tak");

        cena = ustalCene(cena, ileSztuk, czyPromocja);
        //System.out.println(cena);
    }

    static double ustalCene(double cena, int ileSztuk, boolean czyPromocja) {
        if (czyPromocja) {
            if (ileSztuk > 10) {
                cena = cena / 2;
            }
        } else {
            cena *= 1.1;
        }
        return cena;
    }
}
