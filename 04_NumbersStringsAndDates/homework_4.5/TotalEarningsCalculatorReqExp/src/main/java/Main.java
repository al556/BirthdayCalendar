import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(text);

    int sum = 0;

    while (m.find()){
      sum=sum+Integer.parseInt(m.group());
    }
    return sum;
  }

}