package java101;

import javax.lang.model.util.SimpleElementVisitor8;
import java.util.Scanner;

/*import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //scanner class created to get input from user
        Scanner girdi = new Scanner(System.in);

        // values created
        int input1,input2 , sum = 0;


        System.out.println("bir sayi giriniz");
        input1=girdi.nextInt();


        if (input1 >= 0) {

            do {
                System.out.println("bir sayi daha giriniz");
                input2=girdi.nextInt();
                if (input2%2==1){
                    sum+=input2;
                }

            }while (input2>=0);

        } else {
            System.out.println("negatif sayi girdiniz prograg hic baslamadi");
        }
        System.out.println("tek sayilarin toplami"+(sum+input1));

    }
}*/
public class OddNumbers {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int input, sum=0;


        do {
            System.out.println("bir sayi giriniz");
            input = girdi.nextInt();
            if (input%2==0&&input%4==0) {

                sum+=input;

            }


        } while (input % 2 == 0);
        System.out.println("cift ve 4 un katlari olan sayilarin toplami"+ sum);
    }
}



   /*     Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden çift ve 4'ü
        n katları olan sayıları toplayıp ekrana basan programı yazıyoruz*/