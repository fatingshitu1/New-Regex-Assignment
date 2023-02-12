package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssignment {
    static Pattern pattern = Pattern.compile("[A-Z]{3}$");
    static Pattern pattern1 = Pattern.compile("[A-Z]{3,}$");
    static Pattern pattern2 = Pattern.compile("^[A-Za-z]{0,}+@[a-z]{5}[.]*[co][a-z]*$");
    static Pattern pattern3 = Pattern.compile("^[0-9]{2}[ ][0-9]{0,}$");
    static Pattern pattern4 = Pattern.compile("^[a-z]{0,}+@[1-9]{3}$");


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
        testString = "91 9284774178";
        matcher = pattern3.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
        testString = "shital@123";
        matcher = pattern4.matcher(testString);
        if (matcher.matches()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}


