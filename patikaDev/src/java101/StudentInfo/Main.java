package java101.StudentInfo;

public class Main {
    public static void main(String[] args) {

        Course tarih=new Course("tarih","101","trh");
        Course turkce=new Course("turkce","102","trk");
        Course mat=new Course("matematik","103","mat");
        Course fizik=new Course("fizik","104","fzk");
        Course kimya=new Course("kimya","105","kmy");


        Teacher t1=new Teacher("mahmut hoca","111","trh");
        Teacher t2=new Teacher("ufuk hoca","222","trk");
        Teacher t3=new Teacher("omer","333","mat");


        Student s1=new Student("osman","111","4",tarih,turkce,mat);
        Student s2=new Student("veli","222","4",fizik,kimya,tarih);
        Student s3=new Student("ali","333","4",fizik,kimya,tarih);

        tarih.addTeacher(t1);
        turkce.addTeacher(t2);
        tarih.printTeacher();
        turkce.printTeacher();
        System.out.println("==============");
        s1.addBulkExamNote(78,80,100,80,50,50);

        System.out.println("===========");
        s1.isPass();
        System.out.println("===========");
        s1.calAvarage();
        System.out.println("===========");
        s1.printNote();








    }
}

   /* Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini
   her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

     Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/