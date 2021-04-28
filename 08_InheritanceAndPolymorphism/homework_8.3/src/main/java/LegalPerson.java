public class LegalPerson extends Client {

    public void put(double amountToPut){
        super.put(amountToPut);
    }

    public void take(double amountToTake){
        double finalAmmount = amountToTake + (getExtraPercent(amountToTake,1));
        super.take(finalAmmount);
    }



}
