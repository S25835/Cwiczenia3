package com.company; import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = sc.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();

        System.out.print("Podaj płeć (kobieta/mężczyzna): ");
        String plec = sc.nextLine();
        wypisz(imie, nazwisko, plec);
    }

    public static void wypisz(String imie, String nazwisko, String plec) {
        if (plec.equals("mężczyzna")) {
            System.out.print("Student: " + imie + " " + nazwisko);
        }
        else {
            System.out.print("Studentka: " + imie + " " + nazwisko);
        }
    }
}
