import java.util.*;

import static java.util.Collections.binarySearch;

public class CoolNumbers {

    private static List<String> col = new ArrayList<>();


//////////////////


/////////////////

    public static ArrayList<String> generateCoolNumbers() {



        for (int i = 0;i<2_000_000;i++){

            String carnum= returnCarChar()+returnCarNumber()+returnCarChar()+returnCarChar()+returnCarRegion();

            col.add(carnum);

        }

        return new ArrayList<String>(col);
    }

    ///
    public static boolean bruteForceSearchInList(List<String> list, String number) {

        for (String name : list) {
            if (name.contains(number)) {
                return true;
            }
        }
        return false;
    }



    ///
    public static boolean binarySearchInList(List<String> sortedList, String number) {

        int index = binarySearch(sortedList, number);

        if (index == -1) {
            return false;
        }
        else{return true;}

    }

    ///
    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {

        boolean index = hashSet.contains(number);

        return index;

    }

    ///
    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {

        boolean index = treeSet.contains(number);

        return index;

    }

//////////////////////

    /////
    public static LinkedList<String> convertoLinkedList(List<String> list){

        return new LinkedList<String>(list);
    }

    /////
    public static ArrayList<String> returnSortedList(List<String> list){

        ArrayList<String> al = new ArrayList<String>(list);
        Collections.sort(al);
        return al;

    }

    /////
    public static HashSet<String> returnListToHashSet(List<String> list){

        return new HashSet<String>(list);
    }

    /////
    public static TreeSet<String> returnListToTreeSet(List<String> list){

        return new TreeSet<String>(list);
    }


///////////////////////////


    public static int returnCarNumber(){
        int i = generateInt(111,999);
        return i;
    }

    public  static String returnCarRegion(){

        String a;

        int i = generateInt(199);

        if (i<10) {
            a="0"+i;
        }else{
            a=""+i;
        }

        return a;
    }

    public static String returnCarChar(){

        int i = generateInt(12);
        String ch;

        switch (i){
            case 1: ch = "А"; break;
            case 2: ch = "В"; break;
            case 3: ch = "Е"; break;

            case 4: ch = "К"; break;
            case 5: ch = "М"; break;
            case 6: ch = "Н"; break;

            case 7: ch = "О"; break;
            case 8: ch = "Р"; break;
            case 9: ch = "С"; break;

            case 10: ch = "Т"; break;
            case 11: ch = "У"; break;
            case 12: ch = "Х"; break;

            default:
                throw new IllegalStateException("Unexpected value: " + i);
        }

        return ch;
    }

    public  static int generateInt(int maxValue){

        Random r = new Random();
        return r.nextInt((maxValue - 1) + 1) + 1;

    }

    public  static int generateInt(int min,int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
