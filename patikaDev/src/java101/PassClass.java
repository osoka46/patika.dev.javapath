import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      /*  int mt, trk, fzk, km, muz;
        double ortalama;
        Scanner girdi = new Scanner(System.in);
        System.out.println("sinif gecip gecmediginizi kontrol icin nnotlari giriniz. matematik notu");
        mt = girdi.nextInt();
        if (mt < 0) {
            mt = 0;
        } else if (mt > 100) {
            mt = 0;
        } else {
            mt = mt;
        }

        System.out.println("turkce gir");
        trk = girdi.nextInt();
        if (trk < 0) {
            trk = 0;
        } else if (trk > 100) {
            trk = 0;
        } else {
            trk = trk;
        }
        System.out.println("fizik gir");
        fzk = girdi.nextInt();
        if (fzk < 0) {
            fzk = 0;
        } else if (mt > 100) {
            fzk = 0;
        } else {
            fzk = fzk;
        }
        System.out.println("kimya gir");
        km = girdi.nextInt();
        if (km < 0) {
            km = 0;
        } else if (mt > 100) {
            km = 0;
        } else {
            km = km;
        }

        System.out.println("muzik gir");
        muz = girdi.nextInt();
        if (muz < 0) {
            muz = 0;
        } else if (mt > 100) {
            muz = 0;
        } else {
            muz = muz;
        }
        ortalama=(mt+fzk+trk+muz+km)/5;
        System.out.println(ortalama);*/

        int mt, trk, fzk, km;
        double ortalama;
        Scanner girdi = new Scanner(System.in);

        System.out.println("turkce gir");
        trk = girdi.nextInt();
        boolean girdi1 = (0 <= trk) && (trk <= 100);

        System.out.println("matematik gir");
        mt = girdi.nextInt();
        boolean girdi2 = (0 <= mt) && (mt <= 100);

        System.out.println("fzk gir");
        fzk = girdi.nextInt();
        boolean girdi3 = (0 <= fzk) && (fzk <= 100);

        System.out.println("kimya gir");
        km = girdi.nextInt();
        boolean girdi4 = (0 <= km) && (km <= 100);


        if (girdi1 == true) {
            trk = trk;
        } else {
            trk = 0;
        }
        if (girdi2 == true) {
            mt = mt;
        } else {
            mt = 0;
        }
        if (girdi3 == true) {
            fzk = fzk;
        } else {
            fzk = 0;
        }
        if (girdi4 == true) {
            km = km;
        } else {
            km = 0;
        }
        ortalama=(mt+fzk+km+trk)/4;
        if (ortalama>55){
            System.out.println("tebrikler. sonucunuz"+ortalama);
        }else
        {
            System.out.println("gecmis olsun. sonucunuz:"+ortalama);
        }


    }
}
