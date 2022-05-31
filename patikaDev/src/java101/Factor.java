package java101;/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int input=girdi.nextInt();
        int fac=1;


        for (int x=1;x<=input;x++)
        {
            fac*=x;

        }
        System.out.println("faktoriyel esittir:"+fac);

    }
}
*/

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int aKumesi,bKumesi,aFac=1,bFac=1,cFac=1;
        System.out.println("alt kumesini bulacaginiz kumenin eleman sayisini girin");
        aKumesi = girdi.nextInt();

        System.out.println("kac elemanli alt kumesini bulmak istiyorsunz");
        bKumesi=girdi.nextInt();
        if (aKumesi>=bKumesi)
        {
            for (int x=1;x<=aKumesi;x++)
            {
                aFac*=x;
            }

            for (int y=1;y<=bKumesi;y++)
            {
                bFac*=y;
            }
            for (int z=1;z<aKumesi-bKumesi;z++)
            {
                cFac*=z;
            }

        }else {
            System.out.println("alt kume ust kumeden fazla olamaz");
        }
        System.out.println(aFac/bFac*cFac);

        for (int x=1;x<2;x++)
        {
            System.out.println("ne haber");
        }
    }
}


   /* Java ile faktöriyel hesaplayan program yazıyoruz.

        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r
        elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
*/