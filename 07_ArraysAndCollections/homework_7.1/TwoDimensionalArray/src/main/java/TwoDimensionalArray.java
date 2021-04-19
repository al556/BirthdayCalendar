public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] chars = new char[size][size];//irow jcolumn

        ///fill char

        for (int i = 0 ; i<size; i++){
            for (int j = 0 ; j<size; j++){
                chars[i][j]=' ';
            }
        }


        // do x's
        int start = 0;
        int end = size-1;

        for (int i=0;i<size;i++){

            chars[i][start] = 'X';
            chars[i][end] = 'X';
            start++;
            end--;
        }

        return chars;
    }
}
