package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidatePassWordUC5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String PassWord = scan.next();
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,20}$";
        boolean result = PassWord.matches(regex);
        if(result) {
            System.out.println("Given Password is valid");
        }
        else
        {
            System.out.println("Given Password is not valid");
        }
    }
}
