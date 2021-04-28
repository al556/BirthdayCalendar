
public class CardAccount extends BankAccount {


    public boolean take(double amountToTake) {
        double percent = amountToTake/100;

        double totake = amountToTake+percent;

        boolean bool = super.take((totake));

        return bool;
    }


}
