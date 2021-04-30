package Company;

public interface Employee {

    int getMonthSalary();


    int getEarning();




    //int setCompanyWage();
    default int generateRandomProfit(){

        int i = Company.generateInt(115_000,140_000);
        return i;

    }




}
