import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.

      if(input.matches(".*[a-zA-Z]+.*")){error();}

      String text = input.replaceAll("[^0-9]", "");


      //creating array of number
      //int [] arr = new int [text.length()];
      StringBuilder sbTel = new StringBuilder();

      for(int i=0; i<text.length(); i++) {
        sbTel.append(text.charAt(i));
        //System.out.println(sbTelNumber.charAt(i));
      }

      //check size
      if((sbTel.length()<10)||(sbTel.length()>11)){
        error();
        break;
      }

      if(sbTel.length()==10){
        sbTel.insert(0,"7");
      }



      //check and if need replace first number
      char ch = sbTel.charAt(0);

      if ((ch!='7')&&(ch!='8')){
        error();
        break;
      }

      if (ch=='8'){
        sbTel.replace(0,1,"7");
      }

      //print result
      System.out.println(sbTel);


    }

  }



  public static void error(){
    System.out.println("Неверный формат номера");
  }


}
