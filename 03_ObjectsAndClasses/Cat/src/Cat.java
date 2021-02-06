import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cat{
    //homework done (test)
    private final double numOfEyes = 2;
    private final Color color;
    private final double originWeight;
    private final double minWeight;
    private final double maxWeight;

    private double foodeaten;
    private double weight;

    //hw6
    private Okras okras;

    /////////////////////////hw3
    private static int count = 0;
    /////////////////////////hw5
    public Cat(double weight){
        this.weight=weight;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodeaten =0;
        count = count+1;

        int ii = ThreadLocalRandom.current().nextInt(1,3+1);
        int iii = ThreadLocalRandom.current().nextInt(1,6+1);

        color = setColorAtRandom(ii);
        okras = setOkrasAtRandom(iii);
    }



    public Cat(){

        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodeaten =0;
        count = count+1;

        int ii = ThreadLocalRandom.current().nextInt(1,3+1);
        int iii = ThreadLocalRandom.current().nextInt(1,6+1);

        color = setColorAtRandom(ii);
        okras = setOkrasAtRandom(iii);
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
    public Color setColorAtRandom(int i){

        Color col;

        switch (i) {
            case 1:
                col = Color.GREEN;
                break;
            case 2:
                col = Color.BLUE;
                break;
            case 3:
                col = Color.BROWN;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

        return col;
    }

    public Okras setOkrasAtRandom(int i){

        Okras okr;

        switch (i) {
            case 1:
                okr = Okras.BLACK;
                break;
            case 2:
                okr = Okras.WHITE;
                break;
            case 3:
                okr = Okras.STRIPES;
                break;
            case 4:
                okr = Okras.ORANGE;
                break;
            case 5:
                okr = Okras.GREY;
                break;
            case 6:
                okr = Okras.SPOTTED;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

        return okr;
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


    public Double getWeight(){
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

    public String getColor(){
        return color.getColor();
    }


    //////////////////hw6
    public Okras getOkras() {
        return okras;
    }

    public void setOkras(Okras okras) {
        this.okras = okras;
    }


}