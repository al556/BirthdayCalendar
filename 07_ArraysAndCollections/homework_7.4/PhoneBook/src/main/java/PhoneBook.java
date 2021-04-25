import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    private HashMap<String, String> phonesMap = new HashMap<String, String>();


    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (checkIfPhoneString(phone)&&checkIfNameSurname(name)){

            String a = phone;   cleanPhoneString(phone);
            String b = name;   cleanName(name);

            if(!(a==""||b=="")){
                phonesMap.put(a,b);
            }

        }
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку


        if(!phonesMap.containsKey(phone)){
            return "";
        }
        else {
            String nameOutput = phonesMap.get(phone);
            return nameOutput+" - "+phone;
        }
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet

        TreeSet<String> treeSet = new TreeSet<>();

        for (HashMap.Entry<String, String> pair : phonesMap.entrySet()) {

            if (pair.getValue()==name){
                treeSet.add(pair.getValue()+" - "+pair.getKey());



            }
        }
        return treeSet;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        for (HashMap.Entry<String, String> pair : phonesMap.entrySet()) {
                treeSet.add(pair.getValue()+" - "+pair.getKey());
        }

        return treeSet;
    }


    /////////
    public boolean containName(String name){//value
        return phonesMap.containsValue(name);
    }

    public boolean containNumber(String number){//key
        return phonesMap.containsKey(number);
    }


    ////////////////////////////////////////////////////
    public boolean checkIfNameSurname(String str){

        if (str.matches("[а-яА-Я-\\s+]+")){
            return true;}
        else{
            return false;}
    }

    public boolean checkIfPhoneString(String str){

        if (str.matches("^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?")){

            return true;}
        else{

            return false;}
    }

    public String cleanPhoneString(String str){

        String a = str.trim().replaceAll(" +","");
        String b = a.replaceAll("\\.","");
        String c = b.replaceAll("-","");

        return c;
    }

    public String cleanName(String str){
        String a = str.trim().replaceAll(" +", " ");
        return a;
    }


}