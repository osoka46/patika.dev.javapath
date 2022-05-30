import java.util.Scanner;
import java.util.WeakHashMap;

public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int ebob = 1, ekok = 1;

        System.out.println("ilk sayi:");
        int number1 = girdi.nextInt();
        System.out.println("2. sayi:");
        int number2 = girdi.nextInt();


       /* if (number1 > number2) {
            for (int a = 1; a <= number2; a++) {
                if (number1 % a == 0 && number2 % a == 0) {
                    ebob = a;
                }
            }
            System.out.println("ebob:"+ebob);
        } else if (number2 > number1) {
            for (int b = 1; b <= number1; b++) {
                if (number1 % b == 0 && number2 % b == 0) {
                    ebob = b;
                }
            }
            System.out.println("ebob:"+ebob);

        } else {
            System.out.println("esit sayi girdiniz.");
        }*/

        if (number1 > number2) {
            for (int x = number2; x > 0; x--) {
                if (number1 % x == 0 && number2 % x == 0) {
                    ebob = x;
                    break;
                }
            }
            System.out.println("ebob:" + ebob);

        } else if (number1 < number2) {

            for (int y = number1; y > 0; y--) {
                if (number1 % y == 0 & number2 % y == 0) {
                    ebob = y;
                    break;
                }
            }
            System.out.println("ebob:" + ebob);

        } else {
            System.out.println("sayilar esit");
        }
        //ekok
       /* ekok=number1*number2/ebob;
        System.out.println("ekok:"+ekok);*/

        for (int z = 1; z <= number1 * number2; z++) {
            if (z % number1 == 0 && z % number2 == 0) {
                ekok = z;
                break;
            }
        }
        System.out.println("ekok:" + ekok);

        if (number1<number2) {
            int a = 1;
            while (a <= number1) {
                if (number1 % a == 0 && number2 % a == 0) {
                    ebob = a;
                }
                a++;
            }
        }else {
            int b=1;
            while (b<=number2)
            {
                if (number2 % b==0 && number1 %b ==0)
                {
                    ebob=b;
                }
                b++;
            }
        }
        System.out.println("ebob2:"+ ebob);

    }
}