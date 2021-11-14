package com.company; import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj miesiąc: ");
        int miesiac = sc.nextInt();

        System.out.print("Podaj rok: ");
        int rok = sc.nextInt();

        String kwartal = ktoryKwartal(miesiac);

        System.out.println(
                miesiac + "." + rok + " to " + kwartal + " kwartal " + rok + " roku"
        );
    }

    static String ktoryKwartal(int miesiac) {
        if (miesiac < 4) {
            return "I";
        } else if (miesiac < 7) {
            return "II";
        } else if (miesiac < 10) {
            return "III";
        } else {
            return "IV";
        }
    }
}
