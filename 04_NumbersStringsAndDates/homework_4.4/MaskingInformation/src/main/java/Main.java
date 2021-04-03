import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String d = searchAndReplaceDiamonds("Номер кредитной< карты <1234> 4008 1234 <<5678>> 8912","***");

        System.out.println(d);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений



        int pervayaSkobka = 0;
        int vtorayaSkobka = 0;
        int s;

        ///////////////////
        //check for < at the end

        String body = "";
        String head = "";

        for (int i =text.length()-1;i>=0;i--){
            if(text.charAt(i)=='<'){
                head = text.substring(i);
                body = text.substring(0,i);
                break;
             }else if(text.charAt(i)=='>'){
                head = "";
                body = text;
                break;
            }else {
                head = "";
                body = text;
                break;
            }
         }

        System.out.println(head);
        System.out.println(body);

        //////////////////

        String ourstring = body;


        for (int i =0;i<=ourstring.length()-1;i++){
            if(ourstring.charAt(i)=='<'){
                pervayaSkobka++;
            }
        }
        for (int i = ourstring.length()-1;i>=0;i--){
            if(ourstring.charAt(i)=='>'){vtorayaSkobka++;}
        }

        if(pervayaSkobka<vtorayaSkobka) {s=vtorayaSkobka;}
        else {s=pervayaSkobka;}

        for (int i =0; i<=s;i++){

            ourstring = oneReplace(ourstring,placeholder);

        }


        //System.out.println("------------------------------");



        return ourstring+ head;

    }

    //////////////////////////////////////////////////////////////////
    public static String oneReplace(String text, String placeholder){

        int pervayaSkobka = -1;
        int vtorayaSkobka = -1;
        String ourstring = "";

        for (int i = text.length()-1 ;i>=0;i--){
            if(text.charAt(i)=='<'){

                pervayaSkobka=i;

                break;
             }
         }

        //for (int i = 0 ;i<=text.length()-1;i++){
        //    if(text.charAt(i)=='<'){

         //      pervayaSkobka=i;

        //    break;
        //    }
        //}


        if (pervayaSkobka==-1){
            ourstring=text;
            return ourstring;
        }

        for (int i =pervayaSkobka;i<=text.length()-1;i++){
            if(text.charAt(i)=='>'){
                vtorayaSkobka=i;
                break;
            }

        }


        if(pervayaSkobka==-1||vtorayaSkobka==-1){
            ourstring=text;
        }

        else{
            String start = text.substring(0,pervayaSkobka);
            String end = text.substring(vtorayaSkobka+1);

            ourstring = start+placeholder+end;
        }

        return ourstring;
    }

}