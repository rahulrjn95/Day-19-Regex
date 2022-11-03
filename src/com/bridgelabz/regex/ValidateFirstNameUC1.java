package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidateFirstNameUC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your FirstName:");
        String FirstName = scan.next();
        String regex = "[A-Z][a-z]*";
        boolean result = FirstName.matches(regex);
        if(result) {
            System.out.println("Given FirstName is valid");
        }
        else
        {
            System.out.println("Given FirstName is not valid");
        }
    }
}
