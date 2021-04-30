package WageGenerator;

public class ManagerWage extends Wage{

    public int getWage() {

        int i = returnPercent(generatedEarning,5);

        int ii = fixedWage+i;

        return ii;
    }


    public ManagerWage(int companyEarnings, int generatedEarning){
        this.companyEarnings=companyEarnings;
        this.generatedEarning=generatedEarning;
    }


}
