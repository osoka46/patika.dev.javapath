import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        double toplam=0;


        System.out.println("0dan buyuk bir sayi giriniz");
        int sayi= girdi.nextInt();

        if(sayi>0)
        {
            for (double x=1;x<=sayi;x++)
//x double atanir veya 1 yerine=>> 1.0 yazilarak 1 in int olmadigi gosterilir
            {
                toplam+=1.0/x;

            }
            System.out.println(toplam);



        }else {
            System.out.println("sifirdan kucuk sayi giridiniz program baslamadan bitti");
        }


    }
}
