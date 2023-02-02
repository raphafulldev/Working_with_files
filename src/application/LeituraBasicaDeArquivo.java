package application;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class LeituraBasicaDeArquivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = null;

        File file = new File("c:\\temp\\in.txt");

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {//testa se ainda existe uma nova linha no arquivo
                System.out.println(sc.nextLine()); //se existe uma nova linha, mando imprimir essa linha
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
