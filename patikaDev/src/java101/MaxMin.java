import java.util.Scanner;

/*import java.util.*;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int max,min,number;
        ArrayList<Integer> myList=new ArrayList();

        System.out.println("kac tane sayi girmek istersiniz?");
        int count=girdi.nextInt();
        for (int x=1;x<=count;x++)
        {
            System.out.println(x+". sayiyi giriniz.");
            number= girdi.nextInt();
            myList.add(number);

        }
        max=Collections.max(myList);
        min=Collections.min(myList);
        System.out.println("max sayi:"+max);
        System.out.println("min sayi:"+min);
    }
}*/
public class Collection {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int max=0, min=0, count, number;

        System.out.print("kac tane sayi girmek istersiniz:");
        count = girdi.nextInt();
        for (int x = 1; x <= count; x++) {
            System.out.println(x + ". sayiyi giriniz.");
            number = girdi.nextInt();

            if (x==1)
            {
                max=number;
                min=number;
            }
            else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }
        System.out.println("max sayi:"+max);
        System.out.println("min sayi:"+min);
    }
}