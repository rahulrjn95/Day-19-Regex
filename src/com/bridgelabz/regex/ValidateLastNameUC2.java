package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidateLastNameUC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your LastName:");
        String LastName = scan.next();
        String regex = "[A-Z]+([a-zA-Z]+)*";
        boolean result = LastName.matches(regex);
        if(result) {
            System.out.println("Given LastName is valid");
        }
        else
        {
            System.out.println("Given LastName is not valid");
        }
    }
}
