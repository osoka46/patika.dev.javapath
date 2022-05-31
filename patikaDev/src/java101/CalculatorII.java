package java101;

import java.util.Scanner;

public class CalculatorII {
    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("sonuc:" + result);
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("sonuc:" + result);
        return result;

    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("sonuc:" + result);
        return result;
    }

    static double bolme(double a, double b) {
        if (b==0){
            System.out.println("bolen sifir olamaz");
            return 0;
        }else {
            double result = a / b;
            System.out.println("sonuc:" + result);
            return result;
        }
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("sonuc:" + result);
        return result;
    }

    static void alanCevre(int a, int b) {

        int cevre = 2 * (a + b);
        int alan = 2 * a * b;
        System.out.println("cevre:"+cevre);
        System.out.println("alan:"+alan);

    }

    public static void main(String[] args) {
        System.out.println("yapacaginiz islemi seciniz.\n0.islemi sonlandirmak icin\n1.toplam\n2.cikarma" +
                "\n3.carpa\n4.bolme\n5.mod alma\n6.alan ve cevre");
        Scanner girdi = new Scanner(System.in);
        int select = girdi.nextInt();

        while (true) {
            if (select == 0)
                break;
            System.out.println("islem yapacagniz ilk sayi giriniz");
            int number1 = girdi.nextInt();
            System.out.println("ikinci sayi");
            int number2 = girdi.nextInt();
            switch (select) {
                case 1:
                    toplama(number1, number2);
                    break;
                case 2:
                    cikarma(number1, number2);
                    break;
                case 3:
                    carpma(number1, number2);
                    break;
                case 4:
                    bolme(number1, number2);
                    break;
                case 5:
                    mod(number1, number2);
                    break;
                case 6:
                    alanCevre(number1, number2);
                    break;
                default:
                    System.out.println("yanlis sayi girdiniz.");
            }

        }
        System.out.println("gule gule");

    }
}
