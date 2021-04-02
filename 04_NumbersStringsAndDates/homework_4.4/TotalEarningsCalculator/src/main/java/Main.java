import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    String text = "Вася заработал 5000, Петя - 7563 рубля, а Маша - 30000";
    //TODO: напишите ваш код, результат вывести в консоль




    int sum = 0;
    int temp1;
    int temp2=0;
    int length = text.length()-1;

    ArrayList<String> stringArray = new ArrayList<>();

    //A/////////////////
    for (int i=0;i<=length;i++){

      if((temp2==0)&&(text.charAt(i)==' ')){
        temp1 = i;
        stringArray.add(text.substring(temp2,temp1));
        temp2=temp1;
      }

      else if((i==length)){
        temp1 = i;
        stringArray.add(text.substring(temp2+1,temp1+1));
        temp2=temp1;
      }

      else if ((text.charAt(i)==' ')){
        temp1 = i;
        stringArray.add(text.substring(temp2+1,temp1));
        temp2=temp1;
      }

    }
    //B//////////////////
    //clean numbers
    ArrayList<String> numerics = new ArrayList<>();

    for (int i =0;i<=stringArray.size()-1;i++){

      String temp = stringArray.get(i);

      if(containNumber(temp)){
        temp = cleanString(temp);
        numerics.add(temp);
      }

    }

    //C//////////////////
    for (int j=0;j<=numerics.size()-1;j++){

        sum = sum + Integer.parseInt(numerics.get(j));

    }
    System.out.println(sum);

  }

  /////////////////methods-for-work///////////////////////////////
  public static String cleanString(String s){
    String tempString = "";

    for (Character i:s.toCharArray()){
      if(isNumber(i)){tempString=tempString+i;}

    }
    return tempString;
  }

  public static boolean containNumber(String s){
    boolean bool = false;

    for (Character i:s.toCharArray()){
      if(isNumber(i)){bool=true;}
    }
    return bool;
  }

  public static boolean isNumber(Character ch){
    if(ch=='0'){return true;}
    else if(ch=='1'){return true;}
    else if(ch=='2'){return true;}
    else if(ch=='3'){return true;}
    else if(ch=='4'){return true;}
    else if(ch=='5'){return true;}
    else if(ch=='6'){return true;}
    else if(ch=='7'){return true;}
    else if(ch=='8'){return true;}
    else {return ch == '9';}
  }
/////////////////////////////////////////////////////////////
}