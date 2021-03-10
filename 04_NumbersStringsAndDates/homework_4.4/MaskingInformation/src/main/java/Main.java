public class Main {

    public static void main(String[] args) {

        String d = searchAndReplaceDiamonds("<Номер кредитной карты 4008 1234 5678 8912>","***");

        System.out.println(d);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        int pervayaSkobka = -1;
        int vtorayaSkobka = -1;
        String ourstring = "";


        //check whether we can put placeholder
        for (int i =0;i<=text.length()-1;i++){
            if(text.charAt(i)=='<'){pervayaSkobka=i;}
            else if(text.charAt(i)=='>'){vtorayaSkobka=i;}
            else {continue;}
        }

        if (pervayaSkobka==-1&&vtorayaSkobka==-1){return text;}
        else if (pervayaSkobka==-1||vtorayaSkobka==-1){return text;}
        else if(pervayaSkobka>vtorayaSkobka){return text;}
        //////////////////////////////////////

        //\\\\putting placeholder\\\\\\\\\\\\\\\\\\\\\\\\
        pervayaSkobka=-1;
        vtorayaSkobka=-1;

        for (int i =0;i<=text.length()-1;i++){
            if(text.charAt(i)=='<'){
                    pervayaSkobka=i;

                    if(pervayaSkobka==0&&vtorayaSkobka>0){
                        ourstring=ourstring+placeholder;
                    }

                    if(vtorayaSkobka==0&&pervayaSkobka>0){
                        String a = text.substring(0,pervayaSkobka);
                        ourstring=ourstring+a+placeholder;


                    }else if (pervayaSkobka>vtorayaSkobka){
                        String b = text.substring(vtorayaSkobka+1,pervayaSkobka);
                        ourstring=ourstring+b+placeholder;
                    }

            }
            else if(text.charAt(i)=='>'){
                vtorayaSkobka=i;
            }
            else {continue;}

        }

        String c = text.substring(vtorayaSkobka+1);
        ourstring=ourstring+c;

        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        return ourstring;
    }
}