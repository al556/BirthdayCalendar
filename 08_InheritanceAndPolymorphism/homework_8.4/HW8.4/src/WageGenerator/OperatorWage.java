package WageGenerator;

public class OperatorWage extends Wage{


    public int getWage() {

        if(companyEarnings>10_000_000){

            int i = returnPercent(generatedEarning,50);

            int ii = generatedEarning+i;

            return ii;
        }else{return fixedWage;}



    }

    public OperatorWage(int companyEarnings, int generatedEarning){
        this.companyEarnings=companyEarnings;
        this.generatedEarning=generatedEarning;
    }

}
