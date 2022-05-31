package java101;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        int Armt,Elma,Dmts,Mz,Ptlcn;
        double aFiyat=2.14,eFiyat=3.67,dFiyat=1.11,mFiyat=0.95,pFiyat=5,Ucret;
        Scanner girdi=new Scanner(System.in);

        System.out.println("Armut kac kilo:");
        Armt=girdi.nextInt();
        System.out.println("Elma kac kilo:");
        Elma=girdi.nextInt();
        System.out.println("Domates kac kilo:");
        Dmts=girdi.nextInt();
        System.out.println("Muz kac kilo:");
        Mz=girdi.nextInt();
        System.out.println("Patlican kac kilo:");
        Ptlcn=girdi.nextInt();
        Ucret=(Armt*aFiyat)+(Elma*eFiyat)+(Dmts*dFiyat)+(Mz*mFiyat)+(Ptlcn*pFiyat);
        System.out.println("toplam tutar:"+Ucret);


    }
}
