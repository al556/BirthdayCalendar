package Company;

import WageGenerator.ManagerWage;
import WageGenerator.Wage;


public class Manager implements Employee{

    int companyEarnings;

    int earning = generateRandomProfit();

    Manager(int companyEarnings){
        this.companyEarnings = companyEarnings;
    }

    Wage wage = new ManagerWage(companyEarnings,earning);


    ///////getters

    public int getMonthSalary() {
        return wage.getWage();
    }


    public int getEarning() {
        return earning;
    }




}
