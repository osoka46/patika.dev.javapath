package java101;

import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        double kilo,boy,endeks,boyMetreCinsi;
        Scanner girdi=new Scanner(System.in);

        System.out.println("endeksinizi hesaplamak icin lutfen kilonuzu giriniz ve enter a basiniz:");
        kilo=girdi.nextDouble();
        System.out.println("boyunuzu giriniz ve entera basiniz");;
        boy=girdi.nextDouble();
        boyMetreCinsi=boy/100;
        endeks=kilo/boyMetreCinsi;
        System.out.println("endeksiniz:"+endeks+"kg'dir.");


    }
}
