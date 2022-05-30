import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = girdi.nextInt();
//ucgen cizimi
     /*  for (int x=1;x<=sayi;x++)
       {
           for (int y=1;y<=sayi-x;y++)
           {
               System.out.print(" ");
           }
           for(int z=1;z<=2*x-1;z++)
           {
               System.out.print("*");
           }
           System.out.println();
       }*/
//elmas cizimi

       for (int a = 1; a <= sayi; a++) {
            for (int b = 1; b <= sayi - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
                System.out.println();//1
        }
       for (int d=1;d<sayi;d++)
       {
            for (int e=1;e<=d;e++)
            {
                System.out.print(" ");
            }
            for (int f=1;f<=2*(sayi-d)-1;f++)
            {
                System.out.print("*");
            }
           System.out.println();
       }

    }
}

