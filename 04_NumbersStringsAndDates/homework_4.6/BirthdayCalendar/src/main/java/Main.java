import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 11;
        int month = 04;
        int year = 2021;

        System.out.println(collectBirthdays(year, month, day));

    }

    //11.03.2020
    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        Integer x = 0;

        LocalDate now = LocalDate.now();
        LocalDate inputDate = LocalDate.of(year,month,day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" - dd.MM.yyyy - EE", Locale.getDefault());

        if(inputDate.isAfter(now)){
            return "";
        }

        String finalstring = x.toString()+formatter.format(inputDate)+System.lineSeparator();


        /////////////////////////////////////////////////////////////////////

            while ((inputDate.isBefore(now))||(inputDate.isEqual(now))) {

                if((inputDate.isAfter(now))){

                    System.out.println("extra4"+finalstring);

                    break;

                }

                    System.out.println("extra5");
                    x++;

                    inputDate = inputDate.plusYears(1);

                    if((inputDate.isAfter(now))){
                        System.out.println("eleas");
                        break;
                    }

                    finalstring = finalstring + x.toString() + formatter.format(inputDate);

                    if (inputDate.isBefore(now)) {
                        finalstring = finalstring + System.lineSeparator();
                        System.out.println("extra7");
                    }

            }
        ////////////////////////////////////////////////////////////////////
        
        return finalstring;
    }
}
