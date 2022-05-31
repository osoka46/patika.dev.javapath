package java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        int right=0;
        int selected;
        int[]wrong=new int[5];
        int randomNumber;
        boolean isWin=false;
        boolean isCheck=true;
        Scanner input=new Scanner(System.in);
        randomNumber=(int) (Math.random()*100);


        System.out.println(randomNumber);
        System.out.println("tahminizi giriniz. 0 ile 100 arasi:");

        while (right<5) {

            selected = input.nextInt();

            if (selected > 99 || selected < 0) {
                System.out.println("Belirlenen araliga uygun degil tekrar deneyiniz.");

                if (!isCheck)
                {

                    System.out.println("kalan hakkiniz"+(5-++right));
                }
                else {
                    isCheck=false;
                    System.out.println("hatali deger girdiginizde hakkiniz azalacaktir.");
                }



                continue;
            }

            if (selected == randomNumber) {
                    System.out.println("tebrikler, bildiniz. sayi:" + selected);
                    isWin=true;
                    break;
                }else {


                    if (selected>randomNumber)
                    {
                        System.out.println("daha kucuk bir sayi giriniz:");
                    }else {
                        System.out.println("daha buyuk bir sayi giriniz:");
                    }

                    wrong[right]=selected;
                    right++;
                    System.out.println("kalan hakkiniz:"+(5-right));

                }

        }

        if (!isWin)
        {
            System.out.println("kaybettiniz. Girdiginiz sayilar:");
            for (int element:wrong
                 ) {
                System.out.print(element);

            }

        }
    }
}
