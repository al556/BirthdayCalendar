import Company.Company;
import Company.Employee;
import Technical.ENUMemployee;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Company company1= new Company();

        //add operators
        company1.hireAll(180, ENUMemployee.OPERATOR);

        //add managers
        company1.hireAll(80, ENUMemployee.MANAGER);

        //add topmanagers
        company1.hireAll(10, ENUMemployee.TOPMANAGER);

        //print 15 highest wages
        List<Employee> list1 = company1.getTopSalaryStaff(15);

        System.out.println();
        System.out.println("Список из 15 самых высоких зарплат:");
        for (int i = 0;i<list1.size();i++){
            System.out.println(list1.get(i).getMonthSalary()+" "+"руб.");
        }

        //print 30 lowest wages
        List<Employee> list2 = company1.getLowestSalaryStaff(30);

        System.out.println();
        System.out.println("Список из 30 самых низких зарплат:");

        for (int i = 0;i<list2.size();i++){
            System.out.println(list2.get(i).getMonthSalary()+" "+"руб." );
        }

        //fire 50% of employees
        System.out.println("----------------------------------------");
        System.out.println("Увольняем половину:");
        company1.fireIndiscriminately(company1.getNumberOfEmployees()/2);

        //print 15 highest wages
        List<Employee> list3 = company1.getTopSalaryStaff(15);

        System.out.println();
        System.out.println("Список из 15 самых высоких зарплат:");
        for (int i = 0;i<list3.size();i++){
            System.out.println(list3.get(i).getMonthSalary()+" "+"руб.");
        }

        //print 30 lowest wages
        List<Employee> list4 = company1.getLowestSalaryStaff(30);

        System.out.println();
        System.out.println("Список из 30 самых низких зарплат:");

        for (int i = 0;i<list4.size();i++){
            System.out.println(list4.get(i).getMonthSalary()+" "+"руб.");
        }



    }


}
