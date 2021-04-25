import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Main {

    private static PhoneBook pb = null;


    public static void main(String[] args) {



        PhoneBook pb = new PhoneBook();
        assignPhoneBook(pb);

        boolean continueWorking = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(continueWorking){

            System.out.println("Введите номер, имя или команду:");

            String input = null;
            try {
                input = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }



            if(input.equals("LIST")){inputList();}

            else if(input.equalsIgnoreCase("exit")){continueWorking=false;}

            else if(pb.checkIfPhoneString(input)){inputNumber(input);}

            else if(pb.checkIfNameSurname(input)){inputName(input);}

            else{error();}

        }

    }
    ///////////////////////

    public static void inputName(String input){

        if(pb.containName(input)){

            Set<String> phoneSet = pb.getPhonesByName(input);

            for (String s: phoneSet){
                System.out.println(s);
            }

        }else{

            System.out.println("Такого имени в телефонной книге нет.");
            System.out.println("Введите номер телефона для абонента “"+input+"”:");


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input2 = null;
            try {
                input2 = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(pb.checkIfPhoneString(input2)){pb.addContact(input2,input);
                System.out.println("Контакт сохранен!");
            }
            else{error();}


        }



    }

    public static void inputNumber(String input){

        if(pb.containNumber(input)){

            String s = pb.getNameByPhone(input);

            System.out.println(s);


        }else{

            System.out.println("Такого номера нет в телефонной книге.");
            System.out.println("Введите имя абонента для номера “"+input+"”:");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input2 = null;
            try {
                input2 = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }


            if(pb.checkIfNameSurname(input2)){pb.addContact(input,input2);
                System.out.println("Контакт сохранен!");
            }
            else{
                error();}

        }






    }

    public static void inputList(){

        Set<String> list = pb.getAllContacts();

        for (String s: list){
            System.out.println(s);
        }

    }


    public static void error(){
        System.out.println("Error input");
    }


    //////////////////////
    public static void assignPhoneBook(PhoneBook phonebbok){
        pb=phonebbok;
    }


}
