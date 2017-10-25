package file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by beka on 10/23/17.
 */
public class Main {
    public static String[][] MyArray = new String[740][118];
    public static int[][] MyArrayInt = new int[739][117];
    public static List<Medd> list = new ArrayList<>();

    public static void main() throws FileNotFoundException, UnsupportedEncodingException {
        int Rowc = 0;
        String InputLine = "";

        Scanner scanner;
        scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("/home/administrator/Загрузки/med100.csv"), "Windows-1251")));

        while (scanner.hasNextLine()) {
            InputLine = scanner.nextLine();

            String[] InArray = InputLine.split(";");
            for (int x = 0; x < InArray.length; x++) {

                MyArray[Rowc][x] = InArray[x];
            }
            Rowc++;
            list.add(new Medd(InArray[0], Rowc));
        }


        MyArrayInt = strToIntMatrix(MyArray, 739, 117);
        for (int i = 0; i < 739; i++) {
            for (int j = 0; j < 117; j++) {
                System.out.print(MyArrayInt[i][j]);

            }
            System.out.println();
        }


      /*  for (Medd e : list
                ) {
            int pos = 0;

           pos =  e.getPosition();
           pos -=2;
            System.out.println(e.getName() + " " + pos);
        }*/

    }

    private static int[][] strToIntMatrix(String[][] str, int i, int j) {

        int[][] arr2 = new int[i][j];

        for (int k = 0; k < 739; k++) {
            for (int l = 0; l < 117; l++) {

                arr2[k][l] = Integer.parseInt(str[k + 1][l + 1]);
            }

        }

        return arr2;
    }
}
