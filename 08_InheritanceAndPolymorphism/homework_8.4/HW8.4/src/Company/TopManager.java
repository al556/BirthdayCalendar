package Company;

import WageGenerator.TopManagerWage;
import WageGenerator.Wage;

public class TopManager implements Employee{

    int companyEarnings;

    int earning = generateRandomProfit();

    Wage wage=new TopManagerWage(companyEarnings,earning);

    TopManager(int companyWage){
        this.companyEarnings = companyWage;
    }


    ///////getters
    public int getMonthSalary() {
        return wage.getWage();
    }


    public int getEarning() {
        return earning;
    }


}
