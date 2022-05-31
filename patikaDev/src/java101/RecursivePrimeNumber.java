package java101;

import java.util.Scanner;

public class RecursivePrimeNumber {
    static boolean isPrineNumber(int a, int b) {
        //girilen sayi 2den kucukse false
        if (a < 2)
            return false;
        //b sayisi surekli azaltilacagindan 1e kadar gelebiliyorsa, sayiyi bolebielcek bisey bulunamamistir
        //sonuc true
        if (b == 1) {
            return true;
        } else {
        //sayi, kendisinin yarisina bolunebiliyor, false. b 1 eksiltilip tekrar denenir.
            if (a % b == 0) {
                return false;
            } else {
                return isPrineNumber(a, b - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("sayi giriniz");

        int a = girdi.nextInt();
        //girilen sayinin yarisindan geriye dogru bolebilecek sayi olup olmadigini kontrol icin
        int b = a / 2;
        if (isPrineNumber(a, b) == true) {
            System.out.println(a + " asal sayidir");

        } else {
            System.out.println(a + " asal degildir");
        }


    }
}