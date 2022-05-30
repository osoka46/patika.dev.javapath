import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




    /*    System.out.println("kac elemanli dizi olusturmak istiyorsun?");
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        int[]arr=new int[number];

        for (int x=0,y=1;x<arr.length;x++,y++)
        {
            System.out.println("dizinin "+y+". elemanini giriniz.");
            arr[x]=input.nextInt();
        }*/

        int[]arr={1,4,6,1,4,1};
        //1,1,1,4,6
        Arrays.sort(arr);


      //  System.out.println(Arrays.toString(arr));

        for (int x=0;x< arr.length;x++)
        {
            int count=0;
            for (int y=0;y< arr.length;y++)
            {

               if (arr[x]==arr[y])
               {
                   count++;
               }


            }
            if(count==0)

            /*if (count>=2)
            {
                System.out.println(count);


                System.out.println(arr[x]);

                System.out.println("-=======");
            }*/

            if(a == 0 )
            {
                int sayiAdedi = 0;
                for (int t = 0; t < sayiSayisi; t++) {
                    if(sayiDizisi[i]== sayiDizisi[t])
                    {
                        sayiAdedi ++;
                    }
                }
                bakildimi[bakilansayi] = sayiDizisi[i];
                bakilansayi ++;
                System.out.println(sayiDizisi[i] + " Sayısından " + sayiAdedi + " tane var ");


            }
        }




            //System.out.println("tekrar eden sayilar:"+count+" kere "+Arrays.toString(arr[x]));
            //System.out.println("=========");

        }

    }

}
