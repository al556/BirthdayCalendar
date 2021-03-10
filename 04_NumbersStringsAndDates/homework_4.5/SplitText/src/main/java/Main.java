public class Main {

  public static void main(String[] args) {



  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String temp;
    String returnString = "";

    //clean temp
    temp = text.replaceAll("[^a-zA-Z\\s\\'\\-\\’]", "");
    temp = temp.replaceAll("-", " ");
    temp = temp.replaceAll(" +", " ");


    //check string length
    String[] myStrings = temp.split(" ");

      //creating string
    for (int i = 0; i < myStrings.length; i++) {

        returnString = returnString + myStrings[i];
        if(i<myStrings.length-1){
          returnString = returnString + "\n";
        }

    }

      return returnString;
    }


}