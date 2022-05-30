/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String password, userName;

        String ps = "12345", name = "osman";
        int right=3,select,balance=1500;


        while (right > 0) {
            System.out.println("user name giriniz:");
            userName = girdi.nextLine();
            System.out.println("sifresiniz giriniz:");
            password = girdi.nextLine();
            if (userName.equals(name) && password.equals(ps)) {
                System.out.println("sisteme giris yaptiniz");
                do {

                    System.out.println(" 1.para yatirma \n 2.para cekme \n 3.balans kontrol \n 4.cikis yapma");
                    System.out.print("yapmak istediginiz islemi seciniz:");
                    select= girdi.nextInt();

                    if (select==1)
                    {
                        System.out.println("yatiracaginiz para miktarini giiriniz: ");
                        int price=girdi.nextInt();
                        balance+=price;
                        System.out.println("yeni bakiyeniz: "+balance);

                    }
                    else if (select==2)
                    {
                        System.out.println("cekeceginiz para miktarini giriniz");
                         int price=girdi.nextInt();
                        if (price>balance)
                        {
                            System.out.println("bakiyeniz yetersiz");
                        }else {
                            balance -= price;
                        }
                        System.out.println("yeni bakiyeniz: "+balance);
                    }
                    else if (select==3)
                    {
                        System.out.println("balans miktariniz "+ balance);

                    }
                    else if(select==4)
                    {
                        System.out.println("sistemden cikis yaptiniz");
                    }
                    else
                    {
                        System.out.println("hatali rakam girdiniz");
                    }

                }while (select!=4);
                    break;
            } else {
                right--;
                System.out.println("kullanici adi ve sifre tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("hesabiniz bloke olmustur");
                } else {
                    System.out.println("kalan hakkiniz: " + right);
                }
            }
        }
    }
}

*/


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int right = 3, balance = 1500;

        while (right != 0) {

            System.out.println("username gir:");
            String userName = girdi.nextLine();

            System.out.println("pasaport giriniz: ");
            String pass = girdi.nextLine();


            if (pass.equals("12345") && userName.equals("oss")) {
                System.out.println("sisteme giris yaptiniz. ");
                int a = 0;
                do {
                    System.out.println("yapacaginiz islemi seciniz\n1.para yatirma \n2.para cekme \n3.balans kontrol \n4.cikis yap");
                    a = girdi.nextInt();

                    switch (a) {
                        case 1:
                            System.out.println("yatiracaginiz para miktarini giriniz");
                            int price = girdi.nextInt();
                            while (price < 0) {
                                System.out.println("miktar negatif olamaz. tekrar deneyiniz");
                                price = girdi.nextInt();
                            }
                            balance += price;
                            System.out.println("isleminiz gecerli yeni bakiyeniz=" + balance);

                            break;
                        case 2:
                            System.out.println("cekeceginiz miktari giriniz:");
                            price = girdi.nextInt();
                            while (price < 0) {
                                System.out.println("miktar negatif olamaz. tekrar deneyiniz");
                                price = girdi.nextInt();
                            }
                            if (balance < price) {
                                System.out.println("bakiyeni yetersiz");
                            } else {
                                balance -= price;
                                System.out.println("isleminiz gecerli yeni bakiyeniz=" + balance);
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz:" + balance);
                            break;
                        case 4:
                            System.out.println("guvenli bir sekilde cikis yaptiniz.");
                            break;
                        default: {
                            System.out.println("yanlis numara sectiniz tekrar deneyin");
                        }
                    }
                } while (a != 4);
                break;
            } else {
                right--;
                System.out.println("sifre veya pass. yanlis tekrar deneyin. ");
                System.out.println(right + " hakkiniz kaldi ");
                if (right == 0) {
                    System.out.println("hesabiniz bloke oldu");
                }
            }
        }

    }
}

