public class BankAccount{

  double money = 0;


  public double getAmount() {
    return money;

  }

  public boolean put(double amountToPut) {
    if(amountToPut>0){money += amountToPut;
      return true;
    }else {
      return false;
    }

  }


  public boolean take(double amountToTake) {


    if(!(amountToTake>money)&&amountToTake>0){
      money -= amountToTake;
      return true;
    }else{
      return false;
    }


  }

  //////////////////////////////////////
  public boolean send(BankAccount receiver, double amount){

    boolean bool = take(amount);

    if (bool){
      boolean bool2 = receiver.put(amount);
      return true;
    } else{return false;}

  }




}
