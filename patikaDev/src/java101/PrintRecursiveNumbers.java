package java101;

import java.util.Scanner;

public class PrintRecursiveNumbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        String arrSize = "";
        String arrElements;
        int x=0;
        int[] arr;
        int[] emptyArr;


        System.out.println("what size array do you want to creat?");
        do {

            if (!input.hasNextInt() && right > 0) {
                right--;
                System.err.println("you have typed wrong format. You have " + right + " left");
                if (right == 0) {
                    System.err.println("program did not start");
                    System.exit(0);

                }
                System.out.println("try again: ");
                arrSize = input.nextLine();
            }
            if (input.hasNextInt())
            {
                arr = new int[input.nextInt()];
            }


        } while (!input.hasNextInt() && right > 0);


        right = 3;

        System.out.println("type the numbers of array");

      /* amac: kullanici harf girirse rakam girene kadar 3 hak tanimak,
         3 de harf ise sistemden atmak
         kullanici arr boyutunu ornegin; 3 secerse, dizi elemanlarini yazarken ilk ikisini harf girse dahi
         yinede 3 tane rakam girebilmesine imkan taninmali*/
        // array elemanlarini girerken harf girersem while den sonraki kisim 2 kez donuyor satir 45. yazarsam
        //sorun olmuyor.
        // while den once nesneyi tekrar kullanici girdisine esitleyerek ilk girdiden bagimsiz hale mi getirmemiz gerek?


        // arrElements = input.nextLine();
        do {
            arrElements = input.nextLine();
            if (!input.hasNextInt() && right > 0) {
                right--;
                System.err.println("you have typed wrong format. You have" + right + " left");
                if (right == 0) {
                    System.err.println("program did not start");
                    System.exit(0);

                }
                System.out.println("try again: ");
            }
            if (input.hasNextInt())
            {
               // arr[x]=input.nextInt();
                x++;
            }


        } while (!input.hasNextInt() && right > 0);



    }

//01,4,6,1,7,9,1,0,10
//0,0,1,1,1,4,7,9,10

}