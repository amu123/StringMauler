package co.za.test;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringMauler {

    private static final  String NEW_STRING = "N";
    private static final String APPENDS_STRING = "A";
    private static final String PREPENDS_STRING = "P";
    private static final String REVERSES_STRING = "R";
    private static final String QUIT_APP = "Q";

    public static void main(String[] args) {

        String stringMauler = "";
        System.out.println("Please, Enter Command to start with string mauler: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getActionFromInput(input, stringMauler);


    }

    private static String getActionFromInput(String input, String stringMauler) {
        String action = input.substring(0,1);
        System.out.println("Input: " + input);

        if(action.equals(NEW_STRING)){
            createNewString(stringMauler);
        }

        if(action.equals(APPENDS_STRING)){
            appendsString(input, stringMauler);
        }

        if(action.equals(PREPENDS_STRING)){
            prependsString(input, stringMauler);
        }

        if(action.equals(REVERSES_STRING)){
            reverseString(stringMauler);
        }

        if(action.equals(QUIT_APP)){
            exitApp();
        }

        return action;
    }

    private static void createNewString(String stringMauler){
        String newstringMauler = "";
        System.out.println(stringMauler);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getActionFromInput(input, newstringMauler);
    }

    private static void appendsString(String input, String stringMauler){

        String newstringMauler = stringMauler + input.split(" ")[1];
        System.out.println(newstringMauler);

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        getActionFromInput(input, newstringMauler);
    }

    private static void prependsString(String input, String stringMauler){
        String newstringMauler = input.split(" ")[1] + "" + stringMauler;
        System.out.println(newstringMauler);

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        getActionFromInput(input, newstringMauler);
    }

    private static void reverseString(String stringMauler){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder);
        String newstringMauler = stringBuilder.reverse().toString();
        System.out.println(stringMauler);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getActionFromInput(input, newstringMauler);
    }

    private static void exitApp(){

        System.exit(0);
    }
}
