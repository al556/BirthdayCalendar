package Company;

import Technical.ENUMemployee;
import Technical.companyEmployeeComparator;

import java.util.*;

public class Company {

    static int generateInt(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    /////////////////////////////
    private int companyEarning =0;

    //list of company employees
    private  ArrayList<Employee> companyEmployee = new ArrayList<>();




    /////////////////////////////
    public List<Employee> getTopSalaryStaff(int count){

        ArrayList<Employee> list = getSortedArrayCopy(companyEmployee);
        ArrayList<Employee> finallist = new ArrayList<>();

        for (int i = list.size()-1;i>=list.size()-count;i--){

            finallist.add(list.get(i));

        }

        return finallist;
    }

    public List<Employee> getLowestSalaryStaff(int count){

        ArrayList list = getSortedArrayCopy(companyEmployee);
        ArrayList finallist = new ArrayList<>();

        for (int i = 0;i<count;i++){
            finallist.add(list.get(i));
        }


        return finallist;
    }



    //найм одного сотрудника —
    public void hire(ENUMemployee e){
        Employee employee = null;

        switch (e){

            case MANAGER: employee = new Manager(companyEarning);
            break;

            case TOPMANAGER: employee = new TopManager(companyEarning);
                break;

            case OPERATOR: employee = new Operator(companyEarning);
                break;


        }

        companyEmployee.add(employee);

        addCompanyEarning(employee.getEarning());

    };

    //найм списка сотрудников –
    public void hireAll(int numberOfHire, ENUMemployee hireType){

        for(int i = 0;i<numberOfHire;i++){
           hire(hireType);
        }

    };

    //увольнение сотрудника –
    public  boolean fire(ENUMemployee e){

        Employee employee = null;

        switch (e){

            case MANAGER: employee = new Manager(companyEarning);
                break;

            case TOPMANAGER: employee = new TopManager(companyEarning);
                break;

            case OPERATOR: employee = new Operator(companyEarning);
                break;


        }

        for (int i = 0;i<companyEmployee.size();i++){

            if(companyEmployee.get(i).equals(employee.getClass())){

                substractCompanyEarning(companyEmployee.get(i).getEarning());

                companyEmployee.remove(i);

                return true;

            }


        }

        return false;
    };

    public boolean fireIndiscriminately(int numToFire){

        if(numToFire>companyEmployee.size()){
            return false;

        }else {
            for (int i=0;i<numToFire;i++){
                companyEmployee.remove(i);
            }
            return true;
        }
    }

    ///////////////////
    private ArrayList<Employee> getSortedArrayCopy(ArrayList<Employee> arrayList){

        //System.out.println("       "+companyEmployee.size()+"  "+arrayList.size());

        //for (int i = 0;i<arrayList.size();i++){
         //   System.out.println(" "+i+" "+arrayList.get(i).getMonthSalary());

       // }
        ArrayList<Employee> temp = new ArrayList<>();

        for (int i = 0;i<arrayList.size();i++){
            temp.add(arrayList.get(i));
        }

        Comparator comparator = new companyEmployeeComparator();

        Collections.sort(temp,comparator);

        return temp;
    }

    //получение значения дохода компании –
    int getIncome(){
        return companyEarning;
    };

    void addCompanyEarning(int earning){
        companyEarning = companyEarning+earning;
    }

    void substractCompanyEarning(int earning){
        companyEarning = companyEarning-earning;
    }

    public int getNumberOfEmployees(){
        return companyEmployee.size();
    }

}
