package Ex2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Report extends Employee {
    Report() {
        super();
    }

    ;

    public static void generateReport(Employee[] employees, Locale locale) {
        System.out.println();
        System.out.print("          ");
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);

            for (int i = 0; i < employees.length; i++) {
                //System.out.print();
                NumberFormat numberFormat = NumberFormat.getInstance(locale);
                System.out.printf("  %15s    %12s%n", employees[i].fullname, numberFormat.format(employees[i].salary));
            }

        }
    }
}
