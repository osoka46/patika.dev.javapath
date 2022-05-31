package java101;

import java.util.Scanner;

public class Design {
    static void desen(int a)
    {
        if (a<=0)
        {
            System.out.println(a+" ");
            return;
        }
        System.out.println(a);
        desen(a-5);
        System.out.println(a);



    }


    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int number= girdi.nextInt();
        desen(number);
    }

}
/*
import java.util.Scanner;

public class main {
    static void desen1(int a, int count) {
        System.out.println(a);
        count++;
        if (a > 0) {
            desen1(a - 5, count);
        } else
        {
            desen2(count, a);
        }
    }

    static void desen2(int a, int b) {
        for (int x = 1; x < a; x++) {
            System.out.println((b + 5));
            b += 5;
        }
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int number = girdi.nextInt();
        int count = 0;
        desen1(number, count);
    }
}
*/



   /* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala
        uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan
        5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        Senaryolar
        N Sayısı : 16
        Çıktısı : 16 11 6 1 -4 1 6 11 16

        N Sayısı : 10
        Çıktısı : 10 5 0 5 10

        N Sayısı : 25
        Çıktısı : 25 20 15 10 5 0 5 10 15 20 25

        N Sayısı : 5
        Çıktısı : 5 0 5 */