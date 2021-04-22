import java.util.ArrayList;

public class TodoList {

    ArrayList<String> listOfStuff = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        listOfStuff.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления

        System.out.println("adder");

        if(index>=0&&index<listOfStuff.size()){
            listOfStuff.add(index,todo);
        }else {add(todo);}

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения


        if(index>=0&&index<listOfStuff.size()){

            System.out.println("Дело "+"\""+listOfStuff.get(index)+"\""+
                    " заменено на "+"\""+todo+"\"");

            listOfStuff.set(index,todo);
        }else {error();}

    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if(index>=0&&index<listOfStuff.size()){
            listOfStuff.remove(index);
        }else {error();}
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        //
        ArrayList<String> todos = (ArrayList<String>)listOfStuff.clone();

        return todos;
    }


    public void error(){
        System.out.println("Дело с таким номером не существует");
    }

}