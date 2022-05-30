import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/*import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //created object to get input from user
        Scanner girdi = new Scanner(System.in);
        //created value
        boolean ciftlik = true;
        int sayi,run;

        do {
            System.out.println("pozitif bir sayi giriniz");
            sayi = girdi.nextInt();

            if(sayi>0)
            {
                System.out.println(+sayi+"ya kadar olan cift sayilar");
                for (run = 0; run < sayi; run+=2)
                {
                    System.out.println(run);
                }

            }else {
                System.out.println("negatif sayi girdiniz");
            }

        } while (sayi>0);
    }
}*//*
 */
/*


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int run=0;
        int sayi;
        System.out.println("ciftleri bulmak icin bir rakam giriniz");
        sayi=girdi.nextInt();


           if(sayi>0)
            {
                while (run<sayi) {
                    System.out.println(run);
                    run+=2;
                }
            }else {
               System.out.println("yanlis girdi");
           }


    }
}





/*  Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan s
        ayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*//*


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int a,b;
        System.out.println("bir sayi giriniz");a
        a=girdi.nextInt();


        for(b=0;b<a;b+=2)
        {
        if(b%2==0){
            System.out.println(b);
        }
        }
    }
}
*/
public class main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int input, sum = 0,Count=0;
        System.out.println("bir sayi giriniz");
        input = girdi.nextInt();

        for (int x = 0; x < input; x++) {
            if (x % 3 == 0 && x % 4 == 0) {
                sum = sum + x;
                Count++;
            }


        }
        System.out.println(sum/Count);


    }


}


/*
public static void main(String[] args) {
        int input, y = 0, count = 0, sum = 0;
        double average;
        Scanner girdi = new Scanner(System.in);
        input = girdi.nextInt();

        while (y < input) {
        if (y%3==0&&y%4==0)
        {
        System.out.print("sayilar:"+y+",");
        sum=sum+y;
        count++;
        }
        y++;
        }
        System.out.println("sayilar:"+y);
        System.out.println("ortalama:"+(sum/count));*/
