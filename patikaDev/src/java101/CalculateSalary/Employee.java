package java101.CalculateSalary;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int workHours,int hireYear,int salary)

    {
        this.name=name;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.salary=salary;

    }

    double tax()
    {
        if (this.salary<1000)
        {
            return this.salary;
        }else {
            return this.salary*0.3;
        }

    }

    double raiseSalary()
    {

        return 0;
    }



    /*raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
*/
}


