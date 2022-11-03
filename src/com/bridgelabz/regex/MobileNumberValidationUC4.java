package com.bridgelabz.regex;

import java.util.regex.*;

public class MobileNumberValidationUC4 {
    public static boolean isValidMobileNo(String str) {
        Pattern ptr = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
        Matcher match = ptr.matcher(str);
        return (match.find() && match.group().equals(str));
    }
    public static void main(String[] args) {
        String str = "+91 9919819801";
        if(isValidMobileNo(str)) {
            System.out.println("Given Mobile number is valid");
        }
        else {
            System.out.println("Given Mobile number is not valid");
        }
    }
}
