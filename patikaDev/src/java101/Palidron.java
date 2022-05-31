package java101;

import java.util.Scanner;
import java.util.SortedMap;

public class Palidron {

    static boolean isBoolean(int number) {
        int tempNumber = number, lastNumber, reverseNumber = 0;

        while (tempNumber != 0) {
            lastNumber = tempNumber % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            tempNumber /= 10;
        }
        if (reverseNumber==number)
        {

           return true;

        }else {
           return false;
        }

    }


    public static void main(String[] args) {

        System.out.println("sayi giriniz");
        Scanner girdi = new Scanner(System.in);
        int number = girdi.nextInt();

        System.out.println(isBoolean(number));
    }
}