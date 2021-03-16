public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(-82);

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
    boolean isNegative = false;

    if(number == null){return -1;}

    char[] temp = String.valueOf(number).toCharArray();

    if(temp[0]=='-'){
        isNegative = true;
    }

    int tempnum = 0;

    for (int i = 0; i<temp.length;i++){

          int j = Character.getNumericValue(temp[i]);

          tempnum = tempnum + j;

    }

      if(isNegative){
          tempnum = (tempnum+1)*-1;
      }

    return tempnum;
  }
}
