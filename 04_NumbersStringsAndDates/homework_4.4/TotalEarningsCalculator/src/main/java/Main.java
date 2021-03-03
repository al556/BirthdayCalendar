import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
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
    //A//////////////////

    //b//////////////////
    for (int j=0;j<=stringArray.size()-1;j++){
      //System.out.println(stringArray.get(j));
      try {
        sum = sum + Integer.parseInt(stringArray.get(j));
      }catch (Exception e){
        continue;
      }

    }
    ///b//////////////////
    //System.out.println("------------------");
    System.out.println(sum);
  }
}