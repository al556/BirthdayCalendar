package WageGenerator;

import java.util.Random;

public abstract class Wage {

    int companyEarnings;
    int generatedEarning;

    protected int fixedWage = 100000;

    ////
    public abstract int getWage();




    int returnPercent(int number,double percent){
        return (int)((number/100)*percent);
    }


}
