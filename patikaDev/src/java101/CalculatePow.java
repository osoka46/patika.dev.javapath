/*//while loop

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        //interact with user and value created, assigned from user
        System.out.println("ussunu hesaplamak istediginiz sayiyiy giriniz");
        int input1 = aScanner.nextInt();
        System.out.println("ussunu giriniz");
        int input2 = aScanner.nextInt();
        int pow = 1;
        boolean check = true;
        //created function
       *//* while (check) {
            pow *= input1;
            --input2;
            if (input2 ==0) {
                check = false;
            }
        }
        System.out.println(pow);*//*

        while (input2!=0)
        {
            pow*=input1;
            --input2;
        }
        System.out.println(pow);
    }
}*/

//for loop

/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        int x, y, pow = 1;

        System.out.println("sayi gir");
        x = input.nextInt();

        System.out.println("ussu gir");
        y = input.nextInt();

        if (y >= 0){
            for (; y != 0; y--) {
                pow *= x;
            }
        System.out.println(pow);
    }else {
            System.out.println("eksi giridiniz");
        }
    }
}
*/

//pow() function

/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        int x, y, pow = 1;

        System.out.println("sayi gir");
        x = input.nextInt();

        System.out.println("ussu gir");
        y = input.nextInt();
        double out=Math.pow(x,y);

        System.out.println(out);


    }
}
*/


   /* Java ile kullanıcının
        girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        Ödev
        Java ile kullanıcının girdiği değerler
        ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        double pow;
        boolean check = true;
        //value assigned by user
        do {
            System.out.println("alt sayiyi girin");
            x = input.nextInt();
            System.out.println("ussunu girin");
            y = input.nextInt();
            pow = Math.pow(x, y);
            if (x == 0) {
                System.out.println("program sonlandirildi");
                check = false;
            }
            System.out.println(pow);
        } while (check);
    }
}



