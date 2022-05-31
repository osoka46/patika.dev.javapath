package java101.FightGame;


public class Main  {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Haci",100,5,15,12);
        Fighter f2=new Fighter("Emmi",100,10,10,8);

        Fighter.run(f1,f2);


    }
}
