package Homework2;

public class MainClass {
    public static void main(String[] args) {
        int result = 0;

        String[][] array = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        String[][] errorSize = {{"1", "2", "3", "4", "5"}, {"1", "1", "1", "1"}};
        String[][] errorData = {{"1", "eg", "1", "1"}, {"1", "1", "1", "1"}};

        System.out.println("Результаты расчёта массивов");

        try {
            System.out.println(analyze(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(analyze(errorSize));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(analyze(errorData));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int analyze(String[][] array) {
        int sum = 0;


        if(array.length !=2 || array[0].length != 4 || array[1].length !=4) {
            throw new MyArraySizeException();
        }

        for(int i=0;i < array.length;i++) {
            for(int j=0; j< array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(" Не число в ячейке: " + i + "," + j);
                }
            }
        }
        return sum;
    }
}
