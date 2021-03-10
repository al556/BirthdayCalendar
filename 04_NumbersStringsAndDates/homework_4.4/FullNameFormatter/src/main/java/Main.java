import java.util.Scanner;

public class Main {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }


        //spellcheck
      boolean b = checkspelling(input);
      if (b==false){break;}
        ////////////


      String sentence = input.trim();

        ///count space
      boolean bb = countspace(sentence);
      if (bb==false){break;}
        ///////////


        //printnames/////
      printnames(sentence);
        ///////////

    }

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

  }

//-----------------methods------------------//
  public static boolean isCyrillic(String s) {
    boolean result = false;
    for (char a : s.toCharArray()) {
      if (Character.UnicodeBlock.of(a) == Character.UnicodeBlock.CYRILLIC) {
        result = !result;
        break;
      }
    }
    return result;
  }

    public static boolean checkspelling(String input) {
        boolean sendback = true;
        char c = ' ';
        char prevc = ' ';
        //check for correct spelling
        for(int i=0;i<=input.length()-1;i++){
            prevc = c;
            c = input.charAt(i);

            if(i==0&&!Character.isUpperCase(c)){
                error();
                //br = true;
                sendback = false;
                break;
            }
            if((!Character.isUpperCase(c)&&c!=' ')&&(i!=0)&&(prevc==' ')){
                //br = true;
                sendback = false;
                error();
                break;
            }
            if(!isCyrillic(Character.toString(c))&&!(c==' ')&&!(c=='-')){
                //br = true;
                sendback = false;
                error();
                break;
            }
        }

      return sendback;
    }

    public static boolean countspace(String sentence) {

      boolean bool = true;

        int numOfSpaces=0;
        char c2;
        char prevc2 = 0;
        for(int i=0;i<=sentence.length()-1;i++){

            c2=sentence.charAt(i);
            if((c2==' ')&&(i>0)&&(sentence.charAt(i-1)!=' ')){
                numOfSpaces++;
            }

            if (numOfSpaces>2){
                //br=true;
                bool=false;
                break;
            }
        }

        if(numOfSpaces<2){
            error();
            bool=false;
            //break;
        }

        return  bool;
    }

    public static void printnames(String sentence){

        String familyName = "";
        String name = "";
        String ottchestvo = "   ";

        char ch3;

        int start=0;
        int count =0;
        for(int i=0;i<=sentence.length()-1;i++){



            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i+1)==' ')
                {continue;}
                else if(count==0){
                    familyName = sentence.substring(0,i);
                    start=i;
                    count++;
                }

                else if (count==1){
                    name=sentence.substring(start+1,i);
                    start=i;
                    count++;
                }

            }else if(i==sentence.length()-1){
                ottchestvo=sentence.substring(start+1);
            }


        }
        System.out.println("Фамилия: "+familyName);
        System.out.println("Имя: "+name);
        System.out.println("Отчество: "+ottchestvo);

    }

    public static void error(){
        System.out.println("Введенная строка не является ФИО");
    }

}