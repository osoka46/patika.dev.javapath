package java101;

import java.util.ArrayList;
import java.util.Scanner;

public class RepetitiveNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kac elemanli dizi:");

        int arrLenght = input.nextInt();
        int arr[] = new int[arrLenght];

        System.out.println("0 dan farkli elemanlari gir");

        for (int x = 0; x < arrLenght; x++) {
            arr[x] = input.nextInt();
        }


        int[] dublicate = new int[arr.length];



        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (arr[i] % 2 == 0)) {

                    dublicate[i] = arr[i];

                }
            }
        }

        for (int element : dublicate) {
            if (element!=0)
            {
                System.out.println("tekrar eden cift sayilar: "+element);
            }

        }
    }
}