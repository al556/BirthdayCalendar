
public class Loader{
//homework done

    private static Cat getKitten(){
        return new Cat(1100.00);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        //hw1.1

        Cat[] cat = new Cat[7];

        for (int i=0;i<7;i++){
            cat[i]=new Cat();
        }

        System.out.println("We created "+Cat.getCount()+" cats");

        for (int i=0;i<7;i++){
            System.out.println("Cat "+(i+1)+" weight:"+cat[i].getWeight());
        }

        System.out.println("-------------------------------------------");

        //hw1.2
        cat[0].feed((double) 20);
        cat[1].feed((double) 30);
        System.out.println("cat 1 new weight:"+cat[0].getWeight());
        System.out.println("cat 2 new weight:"+cat[1].getWeight());

        System.out.println("-------------------------------------------");

        //hw1.3
        while(cat[0].getWeight()<=cat[0].getMaxWeight()){
            cat[0].feed((double) 1);
        }

        System.out.println("Cat 1 is "+cat[0].getStatus());

        //hw1.4
        while(cat[1].getWeight()>=cat[1].getMinWeight()){
            cat[1].meow();
        }

        System.out.println("Cat 2 is "+cat[1].getStatus());

        System.out.println("-------------------------------------------");

        cat[1].pee();

        System.out.println(cat[1].getColor());
        System.out.println("-------------------------------------------");

        //////////////hw5//////////////
        Cat cat8 = getKitten();
        Cat cat9 = getKitten();
        Cat cat10= getKitten();

        ///////////////////////////hw7
        //Cat cat11 = (Cat) cat8.clone();

        //System.out.println(cat8.getWeight());
        //System.out.println(cat11.getWeight());


    }
}