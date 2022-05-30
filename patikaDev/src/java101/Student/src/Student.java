public class Student {
    Course tarih;
    Course turkce;
    Course matematik;
    String name;
    String stuNo;
    String clasess;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String clasess, Course tarih, Course turkce, Course matematik) {
        this.name = name;
        this.stuNo = stuNo;
        this.clasess = clasess;
        this.tarih = tarih;
        this.turkce = turkce;
        this.matematik = matematik;
        this.avarage = 0;
        this.isPass = false;

    }

    void addBulkExamNote(int tarih, int turkce, int matematik,int tarihSozlu,int turkceSozlu,int matSozlu) {
       boolean tarihCheck=(tarih>=0&&tarih<=100)&&(tarihSozlu>=0&&tarihSozlu<=100);
       boolean turkceCheck=(turkce>=0&&turkce<=100)&&(turkceSozlu>=0&&turkceSozlu<=100);
       boolean matCheck=(matematik>=0&&matematik<=100)&&(matSozlu>=0&&matSozlu<=100);
        if (tarihCheck)
        {
            this.tarih.note=tarih;
            this.tarih.sozluNote=tarihSozlu;
            this.tarih.sonNote=tarih*0.8+tarihSozlu*0.2;
        }

        if (turkceCheck) {
            this.turkce.note = turkce;
            this.turkce.sonNote=turkceSozlu;
            this.turkce.sonNote=turkce*0.8+turkceSozlu*0.2;
        }
        if (matCheck)
        {
            this.matematik.note = matematik;
            this.matematik.sozluNote=matSozlu;
            this.matematik.sonNote=matematik*0.8+matSozlu*0.2;
        }

    }

    void calAvarage() {
        this.avarage=(this.tarih.sonNote+this.turkce.sonNote+this.matematik.sonNote/3.0);
    }

    void isPass() {
        if (avarage>=55){
            System.out.println("notlariniz: ");
            System.out.println("tebrikler gectiniz. ortalamani: "+avarage);
            this.isPass=true;
        }else {
            System.out.println("gecmis olsun notlariniz: ");
            this.isPass=false;
        }

    }

    void printNote() {
        System.out.println(this.tarih.name+" dersinin notu: "+this.tarih.sonNote);
        System.out.println(this.turkce.name+ " dersinin notu: "+this.turkce.sonNote);
        System.out.println(this.matematik.name+ "dersinin notu: "+ this.matematik.sonNote);
    }


}

/*

    Student Sınıfı Özellikleri :

        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/
