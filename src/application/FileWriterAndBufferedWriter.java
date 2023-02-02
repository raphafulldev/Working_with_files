package application;

import java.io.*;

public class FileWriterAndBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String x : lines) {
                bw.write(x);
                bw.newLine(); // para ter a quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
