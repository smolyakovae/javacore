package lesson5;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        byte[] outData = ("Значение 1;Значение 2;Значение 3" + "\n" + "100;200;300" + "\n" + "400;500;600").getBytes();
        try (OutputStream out = new FileOutputStream("lesson5.txt")) {
            out.write(outData);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        ArrayList<AppData> dataArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("lesson5.txt"))) {
            String tempString = bufferedReader.readLine();
            String[] header = tempString.split(";");
            int[][] data = new int[header.length][header.length];
            int i = 0;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] buffer = tempString.split(";");
                data[i][0] = Integer.parseInt(buffer[0]);
                data[i][1] = Integer.parseInt(buffer[1]);
                data[i][2] = Integer.parseInt(buffer[2]);
                i++;
            }

            dataArrayList.add(new AppData(header, data));
            System.out.println(dataArrayList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
