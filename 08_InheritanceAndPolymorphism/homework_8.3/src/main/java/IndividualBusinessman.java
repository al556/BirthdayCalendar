public class IndividualBusinessman extends Client {


    public void put(double amountToPut){

        if(amountToPut<1000){
            double finalDouble = amountToPut-getExtraPercent(amountToPut,1);
            super.put(finalDouble);
        }

        else if(amountToPut>=1000){
            double finalDouble = amountToPut-getExtraPercent(amountToPut,0.5);
            super.put(finalDouble);
        }else {
            super.put(amountToPut);
        }

    }

    public void take(double amountToTake){
        super.take(amountToTake);
    }

}
