package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.HealthPlan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        HealthPlan plan1 = new HealthPlan("A sigorta", 1, Plan.BASIC);
        HealthPlan plan2 = new HealthPlan("B sigorta", 2, Plan.MEDIUM);
        HealthPlan plan3 = new HealthPlan("C sigorta", 3, Plan.ADVANCE);

        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);

        System.out.println("***************");

        String[] healtplans  = new String[3];
        healtplans[0]= plan1.getName();
        healtplans[1]= plan2.getName();
        healtplans[2]= plan3.getName();

        Employee employee = new Employee("Baran", 1, "test123@wit.com",
                "asdasd", healtplans);

        employee.addHealthPlan(0, "C sigorta");
        System.out.println(Arrays.toString(employee.getHealthPlans()));

        System.out.println("*****************");

        Company company = new Company(1,"Baran", 20000.00, new String[]{"Ali","Veli", "Mahmut"});
company.addEmployee(0, "Ali");
company.addEmployee(1,"Veli");


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
