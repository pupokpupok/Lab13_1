package Ex2;

public class Employee
{
    public String fullname;
    public double salary;
    public Employee() {}

    public Employee(String fullName, double salary)
    {
        this.fullname=fullName;
        this.salary = salary;
    }
    public String getFullName() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
