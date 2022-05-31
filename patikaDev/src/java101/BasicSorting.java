package java101;

import java.util.Scanner;

public class BasicSorting {
    public static void main(String[] args) {
        int a, b,c;
        Scanner girdi=new Scanner(System.in);
        System.out.println("3 tane sayi girip siralamasini kontrol icin enter a basiniz");
        a=girdi.nextInt();
        b=girdi.nextInt();
        c=girdi.nextInt();
        boolean esitlik=a==b||a==c||b==c;
        if (esitlik==false) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println("siralamamiz:" + a + b + c + "seklindedir");
                } else {
                    System.out.println("siralamamiz:" + a + c + b + "seklindedir");
                }
            } else if (b < a && b < c) {
                if (a < c) {
                    System.out.println("siralamamiz:" + b + a + c + "seklndedir");
                } else {
                    System.out.println("siralamamiz:" + b + c + a + "seklindedir");
                }
            } else {
                if (a < b) {
                    System.out.println("siralamamiz:" + c + a + b + "seklindedir");
                } else {
                    System.out.println("siralamamiz:" + c + b + a + "seklindedir");
                }
            }
        }else {
            System.out.println("esit sayi niye giriyon ayi");
        }

    }
}
