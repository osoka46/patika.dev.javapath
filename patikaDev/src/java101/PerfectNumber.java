import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("mukemmel sayi olup olmadigini bulmak istediginiz syiyi yaziniz, " +
                "0 yazarak programi sonlandirabilirsiniz.");
        int number = girdi.nextInt();
        int divider;

        while (number != 0)
        {
            divider=0;
            for (int x = 1; x < number; x++) {
                if (number%x==0)
                {
                    divider+=x;
                }
            }
            if(divider==number)
            {
                System.out.println(number+" mukemmel sayidir.");
            }else {
                System.out.println(number+" mukemmel sayi degildir.");
            }

            System.out.println("sayi girin");
            number= girdi.nextInt();
        }
        if (number == 0) {
            System.out.println("program sonlandirildi");
        }


    }
}
