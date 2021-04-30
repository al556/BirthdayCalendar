package Company;

import WageGenerator.OperatorWage;
import WageGenerator.Wage;

public class Operator implements Employee{

    int companyEarnings;

    int earning = generateRandomProfit();

    Wage wage=new OperatorWage(companyEarnings,earning);

    Operator(int companyEarnings){
        this.companyEarnings = companyEarnings;
    }




    ///////getters
    public int getMonthSalary() {
        return wage.getWage();
    }



    public int getEarning() {
        return earning;
    }

}
