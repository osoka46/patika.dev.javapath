import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String sfr="eSifre",ySifre,deneme,deneme2;
        Scanner girdi=new Scanner(System.in);
        System.out.println("sifre gir");
        deneme=girdi.nextLine();
        if(deneme.equals(sfr))
        {
            System.out.println("sifreniz dogru");
        }
        else {
            System.out.println("Yanlis sifre girdiniz. Yenisini olusturmak istermisiiniz. isterseniz yeni sifre giriniz");
            deneme2=girdi.nextLine();
            if (deneme2.equals("eSifre"))
            {
                System.out.println("eski sifrenizi girdiniz tekrar deneyin");
            }
            else
            {
                System.out.println("yeni sifre basariyla olusturuldu");
            }
        }

    }
}
