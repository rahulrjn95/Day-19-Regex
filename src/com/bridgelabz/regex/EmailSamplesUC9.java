package com.bridgelabz.regex;

import java.util.Scanner;

public class EmailSamplesUC9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Email:");
        String email = scan.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+$";
        boolean result = email.matches(regex);
        if(result) {
            System.out.println("Given email-id is valid");
        }
        else
        {
            System.out.println("Given email-id is not valid");
        }
    }
}
