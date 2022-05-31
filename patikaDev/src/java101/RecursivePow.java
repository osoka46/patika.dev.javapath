package java101;

import java.util.Scanner;

public class RecursivePow {
    static int usAlma(int a,int b)
    {
        if (b==0)
        {
            return 1;
        }else if (b==1)
        {
            return a;
        }
        return usAlma(a, b-1)*usAlma(a,1);
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        while (true) {
            System.out.println("ussunu almak istedigiiniz sayiyi giriniz. islemi sonlandirmak icin 0 giriniz");
            int number1= girdi.nextInt();
            if (number1==0)
            {
                System.out.println("gule gule");
                break;
            }
            System.out.println("ussu giriniz");
            int number2= girdi.nextInt();

            System.out.println(usAlma(number1,number2));


        }

    }


}
/*

    Recursive Metotlar ile Üslü Sayı Hesaplama
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
     "Recursive" metot kullanarak yapan programı yazınız.

        Senaryo
        Taban değeri giriniz :2
        Üs değerini giriniz : 0
        Sonuç : 1
        Taban değeri giriniz : 2
        Üs değerini giriniz : 3
        Sonuç : 8
        Taban değeri giriniz : 5
        Üs değerini giriniz : 3
        Sonuç : 125
*/
