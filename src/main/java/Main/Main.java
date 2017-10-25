package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by beka on 10/23/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String txtFileName = "/home/beka/Downloads/Cluster.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write to txt file: ");
        String fileName = reader.readLine();
        BufferedReader readerFile = new BufferedReader(new FileReader(txtFileName));

    }
}
