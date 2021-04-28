public abstract class Client {

    double money = 0;

    public double getAmount() {
        return money;
    }

    public void put(double amountToPut) {
        if(amountToPut>=0){
            money += amountToPut;
        }

    }

    public void take(double amountToTake) {

        if(amountToTake>0&&amountToTake<=money){
            money -= amountToTake;
        }
    }

    //////////////////////
    public double getExtraPercent(double sum,double percent){
        return (sum/100)*percent;
    }


}
