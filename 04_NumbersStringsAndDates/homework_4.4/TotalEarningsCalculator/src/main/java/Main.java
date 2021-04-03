
public class Main {
  public static void main(String[] args) {

    String text = "Текст = Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    int totalSumm = 0;
    int current = 0;

    int textlength = text.length();
    int i = 0;

    while (i<textlength)
    {
      if (isNumber(text.charAt(i))) {
        current = (current) * 10 + Integer.parseInt(String.valueOf(text.charAt(i)));
      }
      else
      {
        totalSumm = totalSumm + current;
        current = 0;
      }
      i++;
    }

    System.out.println(totalSumm);


  }


  public static boolean isNumber(Character ch){
    if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){return true;}

    else {return false;}



/////////////////////////////////////////////////////////////

  }
}