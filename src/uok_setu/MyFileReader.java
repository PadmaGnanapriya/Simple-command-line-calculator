package uok_setu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Padma Gnananpriya - SE/2017/014
 */
public class MyFileReader {
    private static double num1;
    private static double num2;

    public static void readUserInputFile(String path) throws Exception {
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
        num1= fileReadDataArray.get(0);
        num2= fileReadDataArray.get(1);

        if(fileReadDataArray.size()>2){   //Throwing Exception if more than 2 numbers
            throw new InvalidException("There is more than two numbers");
        }
        fileReadDataArray.removeAll(fileReadDataArray);
        fileReadDataArray.clear();
    }

    public static double getNum1(){   //Passing the num1 if calls
        return num1;
    }
    public static double getNum2(){  //Passing the num2 if calls
        return num2;
    }
}



class InvalidException extends Exception{   //Create InvalidException class to handle, if more than 2 numbers in the file.
    InvalidException(String s){
        super(s);
    }
}