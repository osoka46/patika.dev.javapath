import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //assigned scanner class
        Scanner girdi=new Scanner(System.in);

        //assigned types
        int year,mod;
        String burc="";

        //got value from user
        year=girdi.nextInt();

        //found mod of the value

        mod=year%12;

        //checked which case value from user pass

        switch (mod)
        {
            case 0: burc="maymun";
            break;
            case 1: burc="horoz";
                break;
            case 2: burc="kopek";
                break;
            case 3: burc="domuz";
                break;
            case 4: burc="fare";
                break;
            case 5: burc="okuz";
                break;
            case 6: burc="kaplan";
                break;
            case 7: burc="tavsan";
                break;
            case 8: burc="ejderha";
                break;
            case 9: burc="yilan";
                break;
            case 10: burc="at";
                break;
            case 11: burc="koyun";
                break;

        }
        System.out.println("cin zodyagi burcunuz:"+burc);

    }
}
