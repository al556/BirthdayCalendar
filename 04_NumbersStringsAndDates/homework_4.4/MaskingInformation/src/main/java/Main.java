import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("[My Method]");

        String d = searchAndReplaceDiamonds2("Ном>ер кредитной карты <1234> 4008 1234 <<5678>> 86>7>876879<12","***");

        System.out.println("     "+d);
        System.out.println();
        String e = searchAndReplaceDiamonds2("Ном>ер кред<ит<н<ой карты <1234> 4008 1234 <<5678>> 867876879<12","***");

        System.out.println("     "+e);
        System.out.println();
        System.out.println("====================================");
        System.out.println("[Oficial Method]");

        String f = searchAndReplaceDiamonds("Ном>ер кредитной карты <1234> 4008 1234 <<5678>> 86>7>876879<12","***");

        System.out.println("     "+f);
        System.out.println();
        String g = searchAndReplaceDiamonds("Ном>ер кред<ит<н<ой карты <1234> 4008 1234 <<5678>> 867876879<12","***");

        System.out.println("     "+g);


    }

    public enum State {
        OPEN,
        SECRET,
        ERROR
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        if (text.length() <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        State state = State.OPEN;

        for (int i = 0; i < text.length(); i++) {
            if (state == State.OPEN) {
                if (text.charAt(i) != '<' && text.charAt(i) != '>') {
                    result.append(text.charAt(i));
                }
                if (text.charAt(i) == '<') {
                    state = State.SECRET;
                    stack.push(text.charAt(i));
                    continue;
                }
                if (text.charAt(i) == '>') {
                    state = State.ERROR;
                }
            }
            if (state == State.SECRET) {
                if (text.charAt(i) == '<') {
                    stack.push(text.charAt(i));
                }
                if (text.charAt(i) == '>') {
                    if (stack.empty()) {
                        state = State.ERROR;
                    } else {
                        stack.pop();
                        if (stack.empty()) {
                            state = State.OPEN;
                            result.append(placeholder);
                        }
                    }
                }
            }
            if (state == State.ERROR) {
                return "Error";
            }
        }
        if (state == State.SECRET) {
            return "Error";
        }
        return result.toString();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String searchAndReplaceDiamonds2(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений



        int pervayaSkobka = 0;
        int vtorayaSkobka = 0;
        int s;

        ///////////////////
        //check for < at the end

        System.out.println("text " + text);

        String tail = "";
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
                //System.out.println("B "+i);
                head = "";
                body = text;
            }
         }


        for (int i =0;i<body.length();i++){
            if(body.charAt(i)=='>'){
                tail = body.substring(0,i+1);
                body = body.substring(i+1);
                break;
            }else if(text.charAt(i)=='<'){
                tail = "";
                body = body;
                break;
            }else {
                tail = "";
                body = body;
            }
        }

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


        String clean1 = cleanStringsFromWildLeftSkobkas(ourstring);
        String clean2 = cleanStringsFromWildRightSkobkas(clean1);

        return tail+clean2+ head;

    }

    ///////////////////////////////////////////////////////////////////
    private static String cleanStringsFromWildLeftSkobkas(String ourstring) {
        //<

        int j = 0;

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> cleanstrings = new ArrayList<>();

        for(int i = 0; i<ourstring.length()-2; i++){

            if((ourstring.charAt(i)=='*')&&(ourstring.charAt(i+1)=='*')&&(ourstring.charAt(i+2)=='*')){
                strings.add(ourstring.substring(j,i));
                j=i;
            }
        }
        strings.add(ourstring.substring(j));


        for(int i = 0; i<strings.size();i++){
            String s = strings.get(i);

            if(s.indexOf('<')==-1){
                cleanstrings.add(s);
            }

            else if(s.indexOf('<')!=0) {
                cleanstrings.add(cleanLeft(s));

            }



        }

        String tempstring = "";

        for(String t:cleanstrings){
            tempstring=tempstring+t;
        }


        return tempstring;


    }


    private static String cleanLeft(String ourstring) {

        String st="";

            for (int k = 0; k < ourstring.length(); k++) {

                if (ourstring.charAt(k) == '<') {
                    st=ourstring.substring(0,k);
                    break;
                }

            }

        return st;
    }



    ///////////////////////////////////////////////////////////////////
    private static String cleanStringsFromWildRightSkobkas(String ourstring) {
        //>

        int j = 0;

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> cleanstrings = new ArrayList<>();

        for(int i = 0; i<ourstring.length()-2; i++){

            if((ourstring.charAt(i)=='*')&&(ourstring.charAt(i+1)=='*')&&(ourstring.charAt(i+2)=='*')){
                strings.add(ourstring.substring(j,i));
                j=i;


            }



        }
        strings.add(ourstring.substring(j));



        for(int i = 0; i<strings.size();i++){
            String s = strings.get(i);

            if(s.indexOf('>')==-1){
                cleanstrings.add(s);
            }

            else if(s.indexOf('>')!=0) {
                cleanstrings.add(cleanRight(s));
            }
        }

        String tempstring = "";

        for(String t:cleanstrings){
            tempstring=tempstring+t;
        }


        return tempstring;
    }


    private static String cleanRight(String ourstring) {

        String st="";

        for (int k = ourstring.length()-1; k >=0; k--) {
            if (ourstring.charAt(k) == '>') {
                st=ourstring.substring(k+1);
                break;
            }
        }
        return "***"+st;
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