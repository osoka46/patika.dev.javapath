package java101;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kac elemanli dizi olusturmak istiyorsun?");

        int number= input.nextInt();
        int []arr=new int[number];

        for (int x=0, j=1;x<arr.length;x++,j++)
        {
            System.out.println(j+". sayiyi giriniz.");
            arr[x]=input.nextInt();

        }
        System.out.println("dizi elemanlari:"+Arrays.toString(arr));
        for (int a=0,b=1;a< arr.length;a++,b++)
        {
            System.out.println("dizinin "+ b+ ". elemani: "+arr[a]);
        }
        System.out.println("sirali hali:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));





    }
}
