import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count;
        Scanner girdi = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = girdi.nextInt();

        firstLoop:
        for (int a = 2; a <= sayi; a++) {
            count = 0;
            secondLoop:
            for (int b = 1; b < a; b++) {
                if (a % b == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(a);
            }

        }

    }
}
