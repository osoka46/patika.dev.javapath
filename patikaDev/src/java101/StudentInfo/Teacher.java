package java101.StudentInfo;

public class Teacher {
    String name;
    String telNo;
    String branch;

    Teacher(String name,String telNo,String branch)
    {
        this.name=name;
        this.telNo=telNo;
        this.branch=branch;
    }

    void printTeacherInfo()
    {
        System.out.println("ogretmenin adi:\t"+this.name);
        System.out.println("ogretmenin telNo:\t"+this.telNo);
        System.out.println("ogretmenin branch:\t"+this.branch);

    }

}


   /* Teacher Sınıfı Özellikleri :

        Nitelikler : name,mpno,branch
        Metotlar : Teacher()*/





