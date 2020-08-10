package uok.setu;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

    public static ArrayList<Double> readUserInputFile(String path) throws Exception {
        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj);
        ArrayList<Double> fileReadDataArray = new ArrayList<>();
        while (myReader.hasNextLine()) {
            double data = myReader.nextDouble();
            fileReadDataArray.add(data);
        }
        myReader.close();
        return fileReadDataArray;
    }
}