package java101;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrMaxMin {

    static void MaxMin(int[] arr) {
        int min;
        int max;
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];


        System.out.println("dizinin minimum degeri: " + min);
        System.out.println("dizinin max degeri: " + max);
    }

    //verilen sayidan buyuk en kucuk sayi
    static void bigger(int[] arr, int number) {
        Arrays.sort(arr);


        for (int element : arr) {
            if (element > number) {
                System.out.println(element);
                break;
            }
        }

    }

    //verilen sayidan kucuk en buyuk sayi
    static void less(int[] arr, int number) {

        Arrays.sort(arr);
        int count = 0;
        //50,6,11,42,40,25
        //6,11,25,40,42,50

        for (int x = 0; x < arr.length; x++) {

            if (arr[x] < number) {
                count++;
            }
        }
        System.out.println(arr[count - 1]);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("kac elemanli dizi istiyorszun");

        int number = input.nextInt();
        int[] list = new int[number];

        System.out.println("elemanlari giriniz");

        for (int a = 0; a < list.length; a++) {

            list[a] = input.nextInt();
        }

        ArrMaxMin.MaxMin(list);
        System.out.println("Dizideki elemanlardan, girdiginiz sayiya en yakin sayidan kucuk ve buyuk " +
                "sayiyi bulmak icin baska bir sayi daha giriniz.");

        int number2 = input.nextInt();

        // {1,6,19,50,-60,80,100}
        //{-60,6,19,50,80,100}


        System.out.println("dizi elemanlari:" + Arrays.toString(list));
        System.out.println("verilen sayidan buyuk en kucuk sayi:");
        ArrMaxMin.bigger(list, number2);
        System.out.println("verilen sayidan kucuk en buyuk sayi:");
        ArrMaxMin.less(list, number2);


    }
}
