package java101;/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String ay;
        int day;
        Scanner girdi = new Scanner(System.in);
        System.out.println("hangi ay dogdunuz");
        ay = girdi.nextLine();
        System.out.println("hangi gun dogdunuz");
        day = girdi.nextInt();
        switch (ay) {
            case "ocak":
                if (day < 22) {
                    System.out.println("oglak burcusunuz");

                } else {
                    System.out.println("kova burcusun");
                }
                break;
            case "subat":
                if (day < 20) {
                    System.out.println("kova burcusu");
                } else {
                    System.out.println("balik burcusun");
                }
                break;

            case "mart":
                if (day < 21) {
                    System.out.println("balik burcusun");
                } else {
                    System.out.println("koc burcusun");
                }
                break;
            case "nisan":if
                if (day < 21) {
                    System.out.println("koc burcusun");
                } else {
                    System.out.println("boga burcusun");
                }
            default:{
                System.out.println("yeter aq");
            }

        }


    }

}
*/

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        String ay;
        int gun;
        Scanner girdi = new Scanner(System.in);

        System.out.println("hangi ay dogdun");
        ay = girdi.nextLine();
        System.out.println("hangi gun dogdun");
        gun = girdi.nextInt();

        if (ay.equals("ocak")) {
            if (gun < 22) {
                System.out.println("oglak burcusun");
            } else {
                System.out.println("kova burcusun");
            }

        } else if (ay.equals("subat")) {
            if (gun < 20) {
                System.out.println("kova burcusun");
            } else {
                System.out.println("balik burcusun");
            }
        } else if (ay.equals("mart")) {
            if (gun < 21) {
                System.out.println("balik burcusun");
            } else {
                System.out.println("koc burcusun");
            }
        } else if (ay.equals("nisan")) {
            if (gun < 21) {
                System.out.println("koc burcusun");
            } else {
                System.out.println("boga burcusun");
            }
        } else if (ay.equals("mayis")) {
            if (gun < 22) {
                System.out.println("boga burcusun");
            } else {
                System.out.println("ikizler burcusun");
            }
        } else if (ay.equals("haziran")) {
            if (gun < 23) {
                System.out.println("ikizler burcusun");
            } else {
                System.out.println("yengec burcusun");
            }
        } else if (ay.equals("temmuz")) {
            if (gun < 23) {
                System.out.println("yengec burcusun");
            } else {
                System.out.println("aslan burcusun");
            }
        } else if (ay.equals("agustos")) {
            if (gun < 23) {
                System.out.println("aslan burcusun");
            } else {
                System.out.println("basak burcusun");
            }
        } else if (ay.equals("eylul")) {
            if (gun < 23) {
                System.out.println("basak burcusun");
            } else {
                System.out.println("terazi burcusun");
            }
        } else if (ay.equals("ekim")) {
            if (gun < 23) {
                System.out.println("terazi burcusun");
            } else {
                System.out.println("akrep burcusun");
            }
        } else if (ay.equals("kasim")) {
            if (gun < 22) {
                System.out.println("akrep burcusun");
            } else {
                System.out.println("yay burcusun");
            }
        } else if (ay.equals("aralik")){
            if (gun < 22) {
                System.out.println("yay burcusun");
            } else {
                System.out.println("oglak burcusun");
            }
        }

    }
}
