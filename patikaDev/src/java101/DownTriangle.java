import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int number=girdi.nextInt();

        for (int a=1;a<=number;a++)
        {
            for (int b=1;b<=a;b++)
            {
                System.out.print("-");
            }
            for (int c=1;c<=2*(number-a)+1;c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

