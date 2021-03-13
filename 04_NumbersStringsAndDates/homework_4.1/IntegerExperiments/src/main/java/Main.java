public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(8-5-3);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    //@TODO: write code here and delete TODO line

    if(number == null){return -1;}

    char[] temp = String.valueOf(number).toCharArray();

    int tempnum = 0;

    boolean isNegative = false;

    for (int i = 0; i<temp.length;i++){

      if (temp[i]=='-'){
        isNegative=true;

      }else {
        if(isNegative){
          int j = Character.getNumericValue(temp[i]);
          tempnum = tempnum-j;
          isNegative=false;
        }
        else {
          int j = Character.getNumericValue(temp[i]);
          tempnum = tempnum+j;
        }


      }


    }

    //System.out.println(tempnum);

    return tempnum;
  }
}
