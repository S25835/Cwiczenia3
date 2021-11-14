package com.company; import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj tytuł pierwszego utworu: ");
        String tytul1 = sc.nextLine();
        System.out.print("Podaj czas trwania pierwszego utworu (minuty): ");
        int minuty1 = sc.nextInt();
        System.out.print("Podaj czas trwania pierwszego utworu (sekundy): ");
        int sekundy1 = sc.nextInt();
        sc.nextLine();
        int czasTrwania1 = minuty1 * 60 + sekundy1;
        String info1 = tytul1 + " " + minuty1 + ":" + sekundy1;

        System.out.print("Podaj tytuł drugiego utworu: ");
        String tytul2 = sc.nextLine();
        System.out.print("Podaj czas trwania drugiego utworu (minuty): ");
        int minuty2 = sc.nextInt();
        System.out.print("Podaj czas trwania drugiego utworu (sekundy): ");
        int sekundy2 = sc.nextInt();
        int czasTrwania2 = minuty2 * 60 + sekundy2;
        String info2 = tytul2 + " " + minuty2 + ":" + sekundy2;

        System.out.println("-------------------------------------------");
        System.out.println("UTWORY:");
        System.out.print("1. ");
        if (czasTrwania1 < czasTrwania2) {
            System.out.println(info1);
            System.out.println("2. " + info2);
        } else {
            System.out.println(info2);
            System.out.println("2. " + info1);
        }
        System.out.println("LACZNY CZAS TRWANIA: " + lacznyCzasTrwania(czasTrwania1, czasTrwania2));
        System.out.println("-------------------------------------------");

    }

    static String lacznyCzasTrwania(int pierwszy, int drugi) {
        int suma = pierwszy + drugi;
        int sekundy = suma % 60;
        String sekundyString;
        if (sekundy < 10) {
            sekundyString = "0" + sekundy;
        } else {
            sekundyString = "" + sekundy;
        }
        return (suma / 60) + ":" + sekundyString;
    }
}
