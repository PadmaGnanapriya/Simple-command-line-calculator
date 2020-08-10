package uok.setu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args)  {
        ArrayList<Double> fileReadDataArray;
        fileReadDataArray= getUserInput();
        Calculator calculator=new Calculator(fileReadDataArray.get(0),fileReadDataArray.get(1));
        while (true) {
            System.out.println("\nType your arithmetic operators here");
            System.out.print("(Hint:- add, sub, multy, div) : ");
            String userFunction = scanner.next().toLowerCase();
            String output = calculator.calculate(userFunction);
            System.out.println(output);
        }
    }
    
    public static ArrayList<Double> getUserInput(){
        System.out.print("Enter your file path: ");
        String path=scanner.nextLine();
        ArrayList<Double> usrFileData = new ArrayList<>();
        try {
            usrFileData=MyFileReader.readUserInputFile(path);
        } catch (FileNotFoundException e) {
            System.out.println(">>> The system cannot find the file specified. Try again");
            getUserInput();
        } catch (Exception e) {
            System.out.println(">>> Sorry. The system cannot execute this program.");
            System.out.println(">>> Please make sure given file can contain only two numerical values only.");
            getUserInput();
        }
        return usrFileData;
    }
}
