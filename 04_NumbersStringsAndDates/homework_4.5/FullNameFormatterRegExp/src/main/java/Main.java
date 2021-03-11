import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      String s = "[а-яА-Я-\\s+]+";//\\-?

      //check for correct string
      Pattern pattern = Pattern.compile(s);
      Matcher matcher = pattern.matcher(input);
      boolean bool = matcher.matches();
      if (bool==false){
        error();
        break;
      }

      //prepare string
      String[] finalstring;

      input.trim();
      input = input.replaceAll(" +", " ");
      finalstring = input.split(" ");

      //count string
      if (finalstring.length!=3){
        error();
        break;
      }

      //print string
      print(finalstring);

    }
  }

  public static void error(){
    System.out.println("Введенная строка не является ФИО");
  }

  public static void print(String[] s){
    System.out.println("Фамилия: "+s[0]);
    System.out.println("Имя: "+s[1]);
    System.out.println("Отчество: "+s[2]);
  }

}