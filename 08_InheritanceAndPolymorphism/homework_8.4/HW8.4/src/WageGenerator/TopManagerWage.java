package WageGenerator;

public class TopManagerWage  extends Wage{



    public int getWage() {

        int i = returnPercent(generatedEarning,5);

        int ii = fixedWage+i;

        return ii;
    }




    /////
    public TopManagerWage(int companyEarnings, int generatedEarning){
        this.companyEarnings=companyEarnings;
        this.generatedEarning=generatedEarning;
    }



}
