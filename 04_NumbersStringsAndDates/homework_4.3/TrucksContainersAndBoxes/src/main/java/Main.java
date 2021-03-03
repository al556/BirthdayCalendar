import java.util.Scanner;

public class Main {
    private static final int CONTAINERCOUNT = 27;
    private static final int TRUCKCOUNT = 12*27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        int box = 0;
        try {
            box = Integer.parseInt(boxes);
        }catch (NumberFormatException e){
            System.out.println("You did not input number");
        }

        int container = 1; //1cont = 27box
        int truck = 1;//1 truck = 12 container = (12*27)box


        /////////////////////////////
        for (int i = 0;i<box;i++){

            if((i)%TRUCKCOUNT==0){
                System.out.println("Грузовик: "+truck);
                truck++;
            }
            if((i)%CONTAINERCOUNT==0){
                System.out.println("\tКонтейнер: "+container);
                container++;
            }

            System.out.println("\t\tЯщик: "+(i+1));

        }
        /////////////////////////////
        System.out.println("Необходимо:");
        System.out.println("грузовиков - "+(truck-1)+" шт.");
        System.out.println("контейнеров - "+(container-1)+" шт.");

    }

}
