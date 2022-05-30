import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("kac elemanli f. dizisi istiyorsun");

        int number= girdi.nextInt();
        int a,b=0,c=1;


        //a=b+c, c+a;
        System.out.print(b+","+c+",");
        for (int x=3;x<=number;x++)
        {
            a=b+c;
            System.out.print(a+",");
            b=c;
            c=a;

        }

    }

}

/*9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34*/

