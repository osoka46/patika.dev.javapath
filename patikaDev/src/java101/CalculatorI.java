import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, islem;
        Scanner girdi = new Scanner(System.in);
        System.out.println("lutfen bir sayi seciniz");
        a = girdi.nextInt();
        System.out.println("lutfen bir sayi daha giriniz");
        b = girdi.nextInt();

        System.out.println("lutfen yapacaginiz islemi seciniz: \ntoplama icin 1 \n cikarma icin 2\n carpma icin 3\n bolme icin 4");
        islem=girdi.nextInt();
        if (islem==1){
            System.out.println("toplama isleminizin "+(a+b));
        }else if (islem==2){
            System.out.println("cikarma"+(a-b));
        }
        else if(islem==3){
            System.out.println("carpma"+(a*b));
        }else if (islem==4){
            if (b!=0){
            System.out.println("bolme"+(a/b));}
            else{
                System.out.println("bolen sayi s0 ola,az");
            }
        }else {
            System.out.println("hatali bir islme yaptinz");
        }

    }
}