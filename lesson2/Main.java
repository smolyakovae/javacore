package LESSON2;

import com.sun.deploy.util.StringUtils;

public class Main {
    public static void main(String[] args) {

        String[][] arrayToExecute = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        //String[][] arrayToExecute = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        //String[][] arrayToExecute = {{"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}};
        try {
            System.out.println("Сумма элементов массива: " + arrayElementsSum(arrayToExecute));
        } catch (MySizeArrayException e) {
            e.printStackTrace();
        } catch (MyaArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int arrayElementsSum(String[][] arrayToExecute) throws MySizeArrayException, MyaArrayDataException {
        int sumArray = 0;
        int rows = arrayToExecute.length;
        int cols = arrayToExecute[0].length;

        int[][] arrayToExecuteInt = new int[rows][cols];


        if (rows != 4 || cols != 4) {
            throw new MySizeArrayException("Сегодня на ввод принимаем только 4 элемента");
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arrayToExecute[i][j].matches("[-+]?\\d+")) {
                    arrayToExecuteInt[i][j] = Integer.parseInt(String.valueOf(arrayToExecute[i][j]));
                    sumArray += arrayToExecuteInt[i][j];

                } else {
                    throw new MyaArrayDataException("Не число в ячейке " + "[" + i +"]" +"[" + j + "]");
                }

            }

        }
        return sumArray;
    }
}
