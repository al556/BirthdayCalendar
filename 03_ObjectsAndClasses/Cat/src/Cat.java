
public class Cat{
    //homework done (test)
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodeaten;

    /////////////////////////hw3
    private static int count = 0;
    /////////////////////////


    public Cat(){
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodeaten =0;
        count = count+1;
    }

    public void meow(){
        if (!checkIfDead()) {
            weight = weight - 1;
            System.out.println("Meow");
        }else isdead();
    }

    public void feed(Double amount){
        if (!checkIfDead()) {
            weight = weight + amount;
            foodeaten = foodeaten + amount;
        }else isdead();
    }


    public void drink(Double amount){
        if (!checkIfDead()) {
            weight = weight + amount;
        }else isdead();
    }

    public void pee(){
        if (!checkIfDead()) {
            weight = weight - 1;
            System.out.println("Cat is peeing");
        }else isdead();
    }
    ////////////////////////////////
    //hw3extra
    private boolean checkIfDead(){
        String s = getStatus();
        if(s=="Dead") return true;
        else return false;
    }

    private void isdead(){
        System.out.println("The cat is dead!");
    }
    /////////////////////////////////


    public Double getWeight()
    {
        return weight;
    }

    public String getStatus(){
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    ////////////////////////hw3
    public static int getCount(){
        return count;
    }

    public double getTotalFoodEaten(){
       // return weight-originWeight;
        return foodeaten;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }
}