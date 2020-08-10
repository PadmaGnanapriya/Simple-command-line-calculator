package uok.setu;

/**
 *
 * @author Padma Gnananpriya - SE/2017/014
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

    public static ArrayList<Double> readUserInputFile(String path) throws Exception {
        ArrayList<Double> fileReadDataArray = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(path));

        String contentLine = br.readLine();
        while (contentLine != null) {
            if ( contentLine.trim().length() == 0 ) {
                contentLine = br.readLine();
                continue;
            }
            fileReadDataArray.add(Double.valueOf(contentLine.trim()));
            contentLine = br.readLine();
        }
        return fileReadDataArray;   //Returning
    }
}