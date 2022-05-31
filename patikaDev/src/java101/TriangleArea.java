package java101;

import java.lang.Math;
import java.util.Scanner;
public class TriangleArea {


    public static void main(String[] args) {

double dikKenar1,dikKenar2,hipotenus,sonuc,cevresi,alani,toplamU;
Scanner girdi=new Scanner(System.in);

        System.out.println("hipotenusunu almak istediginiz ucgenin" +
                " dik kenarlarindan birini giriniz ve entera basiniz");
        dikKenar1=girdi.nextDouble();
        System.out.println("2. dik kenari giriniz");
        dikKenar2=girdi.nextDouble();
        hipotenus=(dikKenar1*dikKenar1)+(dikKenar2*dikKenar2);
        sonuc=Math.sqrt(hipotenus);
        toplamU=(dikKenar1+dikKenar2+hipotenus)/2;

        cevresi=(dikKenar1+dikKenar2+hipotenus);
        alani=toplamU*(toplamU-dikKenar1)*(toplamU-dikKenar2)*(toplamU-hipotenus);

        alani=Math.abs(alani);

        System.out.println("hipotenus:"+sonuc);
        System.out.println("cevresi:"+cevresi);
        System.out.println("alani:"+alani);

    }

}