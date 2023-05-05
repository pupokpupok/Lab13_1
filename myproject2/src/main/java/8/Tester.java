package 8;
public class Tester
{
    String name;
    String surname;
    double expirienceInYears;
    String  englishLevel;
    double salary;
    public Tester()
    {}
    public Tester(string name,string surname,double expirienceInYears)
    {
        this.name=name;
        this.surname=surname;
        this.expirienceInYears=expirienceInYears;
    }
    public Tester(String englishLevel,double salary)
    {
        this.englishLevel=englishLevel;
        this.salary=salary;
    }
    public String name1(String name)
    {
        this.name=name;
        return this.name;
    }
    public String surname1(String surname)
    {
        this.surname=surname;
        return this.surname;
    }
    public String expirienceInYears1(String expirienceInYears)
    {
        this.expirienceInYears=expirienceInYears;
        return this.expirienceInYears;
    }
    public static void print(Tester tester)
    {
        System.out.println(tester.name);
        System.out.println(tester.surname);
        System.out.println(tester.expirienceInYears);
        System.out.println(tester.englishLevel);
        System.out.println(tester.salary);
    }
}