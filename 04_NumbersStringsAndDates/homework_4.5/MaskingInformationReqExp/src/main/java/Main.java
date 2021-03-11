public class Main {

    public static void main(String[] args) {

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        String temp = text.replaceAll("<.*?>",placeholder);

        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        return temp;
    }

}