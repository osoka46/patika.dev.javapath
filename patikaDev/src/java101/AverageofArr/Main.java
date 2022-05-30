import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("kac elemanli dizi istiyorszun");

        int number = input.nextInt();
        int []list=new int[number];

        System.out.println("elemanlari giriniz");

        for (int a=0;a<list.length;a++) {

            list[a] = input.nextInt();
        }

        System.out.println("ortalamasi: "+Metod.sum(list));

        System.out.println("harmonik ortalama: "+Metod.harmonik(list));



    }
}
