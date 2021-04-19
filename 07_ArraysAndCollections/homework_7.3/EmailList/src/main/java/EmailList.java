import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> set = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется

        String string = email.toLowerCase();

        if(checkIfValid(email)){
            set.add(string);
        }else {
            System.out.println("error");
        }
    }

    public TreeSet<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке

        List<String> list = new ArrayList<String> (set);

        return set;
    }

    public boolean checkIfValid(String s){

        //String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.\\w+$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);

        boolean b =matcher.matches();

        return b;
    }


}


