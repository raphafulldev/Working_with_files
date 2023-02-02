package application;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class ManipularPastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File [] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");

        for (File x : folders){
            System.out.println(x);
        }

        File [] files = path.listFiles(File::isFile);
        System.out.println();
        for (File x : files){
            System.out.println(x);
        }

        //Para criar uma pasta
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success );
        sc.close();
    }
}
