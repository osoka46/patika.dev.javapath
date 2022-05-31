package java101.mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;


        System.out.println("Mayin tarlasi oyununa hosgeldiniz.");

        System.out.println("tarlanin satiri icin pozitif tamsayi giriniz:");
        String row = input.nextLine();

        System.out.println("tarlanin sutunu icin pozitif tamsayi giriniz:");
        String col = input.nextLine();

        KontrolSinifi objeKontrolSinifi = new KontrolSinifi(row, col);


        while (right != 0) {

            if (!objeKontrolSinifi.isDigit(row, col)) {
                System.out.println("uygun degil. tekrar deneyebilirsiniz " + right + " hakkiniz kaldi");
                System.out.println("tarlanin boyutlari icin satir sayisi:");
                row = input.nextLine();
                System.out.println("tarlanin boyutlari icin sutun sayisi:");
                col = input.nextLine();
                right--;
                if (right == 0) {
                    System.out.println("oyun baslatilamadi.");
                }
            }

            if (objeKontrolSinifi.isDigit(row, col)) {

                int row1 = Integer.parseInt(row);
                int col1 = Integer.parseInt(col);
                MineSweeper objeMineSweeper = new MineSweeper(row1, col1);

                objeMineSweeper.run();


            }
        }
    }
}



