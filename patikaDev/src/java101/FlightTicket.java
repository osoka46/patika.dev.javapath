package java101;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        //value assigned
        int age, distance, type;
        double price, rateDueToAge=0, rateDueToType=0, ageDiscount=0, typeDiscount=0, totalPrice=1;

        //scanner class created to get value from users

        Scanner girdi = new Scanner(System.in);

        //got value to distance from user
        System.out.println("Mesafeyi km türünden giriniz:");
        distance = girdi.nextInt();

        //got value to AGE from user
        System.out.println("Yaşınızı giriniz :");
        age = girdi.nextInt();

        // got value to TYPE from user
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = girdi.nextInt();

        //price calculated
        price = distance * 0.1;

        //check if discount applicable
        if ((age > 0 && distance > 0) && ((type == 1) || (type == 2))) {

            if (age < 12) {
                rateDueToAge = 0.5;
            } else if ((age > 11) && (age < 24)) {
                rateDueToAge = 0.1;
            } else if (age > 65) {
                rateDueToAge = 0.3;
            } else {
                rateDueToAge = 0;
            }
            if (type == 1) {
                rateDueToType = 0;
                totalPrice=(price-(price * rateDueToAge));
            }
            if (type == 2) {
                rateDueToType = 0.2;
                totalPrice=(price-(price * rateDueToAge)-(price*rateDueToType))*2;

            }

        } else {
            System.out.println("yanlis veri girdiniz");
        }
        System.out.println("normal tutar:" + price);
        System.out.println("yas indirimi:" + price * rateDueToAge);
        System.out.println("gidis donus indirimi:" + (price*rateDueToType));
        System.out.println("toplam tutar:"+totalPrice);


        /*System.out.println("normal tutar:" + price);
        System.out.println("yas indirimi:" + (price - price * rateDueToAge));
        System.out.println("indirimli tutar:" + (price - price * rateDueToAge * rateDueToType));
        System.out.println("Toplam Tutar:" + price * rateDueToAge * rateDueToType);*/
    }
}


