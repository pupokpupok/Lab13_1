package Ex2;

import java.util.Locale;

public class Program
{
    public static void main(String[] args)
    {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 35000.123),
                new Employee("Петров Петр Петрович", 40000.123),
                new Employee("Сидоров Сидор Сидорович", 41500.123),
        };
        Locale ru = new Locale("ru2");
        Locale en = new Locale("en2");
        Report.generateReport(employees,ru);
        Report.generateReport(employees,en);
    }
}
