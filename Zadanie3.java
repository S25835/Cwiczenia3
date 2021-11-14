package com.company; import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rok = in.nextInt();
        czyPrzestepny(rok);
    }

    static void czyPrzestepny(int rok) {
        if ((rok % 100 == 0 && rok % 400 != 0) || rok % 4 != 0) {
            System.out.println("nie przestępny");
            return;
        }
        System.out.println("przestępny");
    }
}
