package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class FileReaderAndBufferedReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);


        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); //vai ler uma linha do arquivo. Se o arquivo estiver no final, vai retornar null

            while (line != null) { //enquanto o line for != de null, significa que leu com sucesso a linha.
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {

                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
