import java.lang.Math;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double yariCap,alan,cevre,pi=3.14;
        Scanner girdi= new Scanner(System.in);
        System.out.println("alani ve cevresini hesaplamak istediginiz dairenin yaricapini giriniz:");
        yariCap=girdi.nextDouble();


        alan=yariCap*pi;
        cevre=2*pi*yariCap;

        System.out.println("cemberin cevresi:" +cevre);
        System.out.println("cemberin alani :"+alan);
        alan=yariCap*Math.PI;
        cevre=2*yariCap*Math.PI;

        System.out.println("cemberin alani :"+alan);
        System.out.println("cemberin cevresi:" +cevre);
    }
}
