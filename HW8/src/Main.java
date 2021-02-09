import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;

public class Main{

    public static void main(String[] args) {
        System.out.println("--------");

        Airport airport = Airport.getInstance();

        List<Aircraft> list =  airport.getAllAircrafts();

        int j = list.size();

        for (int i = 0; i<list.size(); i++ ){

            System.out.println(list.get(i).getModel());

        }



    }

}