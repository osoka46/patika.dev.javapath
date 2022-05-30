import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int year;
        //got value from user

        System.out.println("bir il giriniz");
        year = girdi.nextInt();

        //assiged value to check if input divided by 4 and 100
        boolean bolum4 = year % 4 == 0;
        boolean bolum100 = year % 100 == 0;
        boolean bolum400 = year % 400 == 0;


        //cases if inut divided
        if (bolum4) {
            if (bolum100) {

                if (bolum400){
                    System.out.println("sectiginiz sayi artik yil");

                }else{
                    System.out.println("sectiginiz yil artik yil degildir");
                }

            }else {
                System.out.println("sectiginiz yil artik yil degildir");
            }
        }else {
            System.out.println("sectiginiz yil artik yil degildir");
        }
    }
}
