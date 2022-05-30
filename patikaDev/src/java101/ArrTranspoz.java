import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number1,number2;
        System.out.println("kaca kaclik matris girmek istiyorsun. satir sayisi?");
        number1=input.nextInt();
        System.out.println("sutun sayisi?");
        number2=input.nextInt();
        int[][] arr=new int[number1][number2];
        int[][]trans=new int[number2][number1];
        System.out.println("elemanlari giriniz.");

        for (int x=0;x<number1;x++)
        {
            for (int y=0;y<number2;y++)
            {
                System.out.print("elemanlari giriniz. ["+x+"]"+" ["+y+" ]:");
                arr[x][y]=input.nextInt();
            }


        }

       System.out.println("matrisiniz:\n"+Arrays.deepToString(arr));

       /* for (int x=0;x<number1;x++)
        {
            for (int y=0;y<number2;y++)
            {
                System.out.print(arr[x][y]);

            }
            System.out.println();
        }*/

        for (int x=0;x<number1;x++)
        {
            for (int y=0;y<number2;y++)
                trans[y][x]=arr[x][y];
        }
        System.out.println("transpozu: \n"+Arrays.deepToString(trans));



    }
}