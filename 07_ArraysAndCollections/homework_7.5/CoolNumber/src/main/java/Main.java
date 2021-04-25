import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */


    public static void main(String[] args) {

        ArrayList<String> generateNumbers = CoolNumbers.generateCoolNumbers();
        String searchedNumber = generateNumbers.get(1_000_000);

        perebor(generateNumbers,searchedNumber);

        binarSearch(generateNumbers,searchedNumber);

        ///////////////////////////////////////////////////////////////////////


        System.out.println();
        System.out.println("---------------Прочие поиски:--------------");

        HashSet<String> hashSet= CoolNumbers.returnListToHashSet(generateNumbers);

        long startTime5 = System.nanoTime();
        boolean bool5= CoolNumbers.searchInHashSet(hashSet,searchedNumber);
        long stopTime5 = System.nanoTime();

        String boolString5 = returnBool(bool5);
        long time5 = stopTime5-startTime5;
        System.out.println("Поиск в HashSet: номер "+boolString5+", поиск занял "+time5+"нс");
        System.out.println();
        /////////////////////////////////////////////////////////

        TreeSet<String> treeSet = CoolNumbers.returnListToTreeSet(generateNumbers);

        long startTime6 = System.nanoTime();
        boolean bool6= CoolNumbers.searchInTreeSet(treeSet,searchedNumber);
        long stopTime6 = System.nanoTime();

        String boolString6 = returnBool(bool6);
        long time6 = stopTime6-startTime6;
        System.out.println("Поиск в TreeSet: номер "+boolString6+", поиск занял "+time6+"нс");


    }


    static void perebor(ArrayList<String> generateNumbers,String searchedNumber){

        System.out.println("----------Поиск_перебором------------------");
        System.out.println("--ArrayList");

        long startTime1 = System.nanoTime();
        boolean bool1= CoolNumbers.bruteForceSearchInList(generateNumbers,searchedNumber);
        long stopTime1 = System.nanoTime();

        String boolString = returnBool(bool1);
        long time = stopTime1-startTime1;

        System.out.println("Поиск перебором: номер "+boolString+", поиск занял "+time+"нс");
        System.out.println();
        //////////////////////////////////////////////////////////////

        System.out.println("--LinkedList");
        LinkedList<String> linkedList = CoolNumbers.convertoLinkedList(generateNumbers);

        long startTime2 = System.nanoTime();
        boolean bool2= CoolNumbers.bruteForceSearchInList(linkedList,searchedNumber);
        long stopTime2 = System.nanoTime();

        String boolString2 = returnBool(bool2);
        long time2 = stopTime2-startTime2;
        System.out.println("Поиск перебором: номер "+boolString2+", поиск занял "+time2+"нс");
        System.out.println();
        System.out.println();
    }

    static void binarSearch(ArrayList<String> generateNumbers,String searchedNumber){

        System.out.println("---------ArrayList_Бинарный поиск:---------");
        System.out.println("--неотсортировано");

        long startTime3 = System.nanoTime();
        boolean bool3= CoolNumbers.binarySearchInList(generateNumbers,searchedNumber);
        long stopTime3 = System.nanoTime();

        String boolString3 = returnBool(bool3);
        long time3 = stopTime3-startTime3;
        System.out.println("Бинарный поиск: номер "+boolString3+", поиск занял "+time3+"нс");
        System.out.println();
        /////////////////////////////////////////////////////////

        System.out.println("----отсортировано");
        ArrayList<String> generateNumbers2 = CoolNumbers.returnSortedList(generateNumbers);

        long startTime4 = System.nanoTime();
        boolean bool4= CoolNumbers.binarySearchInList(generateNumbers2,searchedNumber);
        long stopTime4 = System.nanoTime();

        String boolString4 = returnBool(bool4);
        long time4 = stopTime4-startTime4;
        System.out.println("Бинарный поиск: номер "+boolString4+", поиск занял "+time4+"нс");
        System.out.println();

    }

    static String returnBool(boolean b){
        if(b){
            return "найден";
        }else{return "не найден";}
    }
}
