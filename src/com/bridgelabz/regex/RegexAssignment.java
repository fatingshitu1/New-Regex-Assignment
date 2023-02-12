package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssignment {
    static Pattern pattern = Pattern.compile("[A-Z]{3}$");
    static Pattern pattern1 = Pattern.compile("[A-Z]{3,}$");
    static Pattern pattern2 = Pattern.compile("^[A-Za-z]{0,}+@[a-z]{5}[.]*[co][a-z]*$");

    public static void main(String[] args) {
        String testString = "SAI";
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid First Name");
        } else {
            System.out.println("Invalid First Name");
        }
        testString = "TATA";
        matcher = pattern1.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid last Name");
        } else {
            System.out.println("Invalid Last Name");
        }
        testString = "Shital@gmail.com";
        matcher = pattern2.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}


