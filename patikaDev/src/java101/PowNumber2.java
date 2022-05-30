/*import java.util.Scanner;

*//*

//Calculate power of a number using a while loop

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, sum=1;
        Scanner girdi = new Scanner(System.in);

        do {
            System.out.println("kuvvetini almak istediginiz pozitif bir sayi giriniz");
            a = girdi.nextInt();
        } while (a < 0);

        do {
            System.out.println("sayinin kuvvetini yaziniz pozitif olmali");
            b = girdi.nextInt();
        } while (b < 0);

         for (;b>0;--b){
           sum*=a;
             System.out.println(sum);
        }


    }
}
*//*
public class main {
    public static void main(String[] args) {
        int input,x,y;
        Scanner girdi=new Scanner(System.in);

        System.out.println("sayi giriniz");

        input=girdi.nextInt();

        for(x=1;x<input;x*=2)
        {
            System.out.println(x);
        }
    }
}*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);

        System.out.println("bir sayi giriniz");
        int input=girdi.nextInt();

      /*  for(int x=1;x<input;x*=4)
        {
            System.out.println(x);

        }
        for (int y=1;y<input;y*=5)
        {
            System.out.println(y);
        }*/

    }
}


/*
    Java döngüler ile girilen sayıya kadar olan 2'nin
        kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve
        5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
