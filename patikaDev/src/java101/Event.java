package java101;

import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        double sicaklik;
        Scanner girdi = new Scanner(System.in);
        System.out.println("hava sicakligini giriniz");
        sicaklik = girdi.nextDouble();

        boolean dogruluk = (5 < sicaklik) && (sicaklik < 40);

        if (dogruluk == true) {

            if (sicaklik > 5 && sicaklik <= 15) {
                System.out.println("sinemaya git");
            } else if (sicaklik > 15 && sicaklik <= 25) {
                System.out.println("piknige git");
            } else {
                System.out.println("yuzmeye git");
            }
        } else {
            System.out.println("atma niyazi");
        }

    }
}