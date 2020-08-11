package uok_setu;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Padma Gnananpriya - SE/2017/014
 */
public class Main {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){

        getUserInput();  //Calling method getUserInput() to ask file path

        Calculator calculator = new Calculator(MyFileReader.getNum1(), MyFileReader.getNum2());
        System.out.println("\tNumber 1 is = "+MyFileReader.getNum1()+"\n\tNumber 2 is = "+MyFileReader.getNum2());
        while (true) {
            System.out.println("\nType your arithmetic operation here");
            System.out.print("(Hint:- add, sub, mul, div) : ");
            String userFunction = scanner.next().toLowerCase();
            String output = calculator.calculate(userFunction);
            System.out.println(output);
        }
    }

    private static void getUserInput(){
        System.out.print("Enter your file path: ");
        String path=scanner.nextLine();          //   absolute path Or Relative path needed
        try {
            MyFileReader.readUserInputFile(path);
        } catch (FileNotFoundException e) {
            System.out.println(">>> The system cannot find the file specified. Try again");
            getUserInput();
        } catch (NumberFormatException e) {
            System.out.println(">>> Sorry. The system cannot execute this program.");
            System.out.println(">>> Please make sure given file can contain only two numerical values only.");
            getUserInput();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(">>> Sorry. The system cannot execute this program.");
            System.out.println(">>> The given file contains only one numerical value.");
            getUserInput();
        }
        catch (InvalidException e) {
            System.out.println(">>> Sorry. The system cannot execute this program.");
            System.out.println(">>> The given file contains more than two numerical value.");
            getUserInput();
        }
        catch (Exception e) {
            System.out.println(e);
            getUserInput();
        }
    }
}
