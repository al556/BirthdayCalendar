import java.time.LocalDate;


public class DepositAccount extends BankAccount {

    private LocalDate lastIncome = null;

    private void doThePutMethod(double amountToPut){
        super.put(amountToPut);
    }



    public boolean put(double amountToPut) {

        LocalDate currentDate = LocalDate.now();

        if(lastIncome == null){
            lastIncome=LocalDate.now();
            doThePutMethod(amountToPut);
            return true;
        }else if(lastIncome.getMonth() == currentDate.getMonth()){
            //donothing
            return true;
        }else{
            doThePutMethod(amountToPut);
            return false;
        }

    }

}
