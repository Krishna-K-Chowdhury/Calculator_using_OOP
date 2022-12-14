package com.calculator.reader;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadInput {
    private final String regex = "([-+]?[0-9]*\\.?[0-9]+[\\/\\+\\-\\*])+([-+]?[0-9]*\\.?[0-9]+)";

    public ReadInput() {}

    public boolean validateInput(String input) {
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static String read() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a mathematical expression(like: 2*6/3-4+2)");

        String inputLine = scanner.nextLine();

        ReadInput readInput = new ReadInput();

        if(!readInput.validateInput(inputLine)) {
            System.out.println("Invalid Expression");
            System.exit(0);
        }

        return inputLine;
    }

}