public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double sozluNote;
    double sonNote;


    Course(String name,String code,String prefix)
    {

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sozluNote=0;
        this.sonNote=0;
    }
    void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix))
        {
            System.out.println("hoca atamasi yapildi");
            this.teacher=teacher;
        }else
        {
            System.out.println("sectiginiz hoca bu derse uygun degil");
        }

    }
    void printTeacher()
    {
        System.out.println(this.name+" dersinin hocasi: "+teacher.name);
        teacher.printTeacherInfo();
    }

}

        /* Course Sınıfı Özellikleri :
        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()*/