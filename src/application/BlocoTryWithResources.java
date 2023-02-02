package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class BlocoTryWithResources {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); //vai ler uma linha do arquivo. Se o arquivo estiver no final, vai retornar null

            while (line != null) { //enquanto o line for != de null, significa que leu com sucesso a linha.
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
