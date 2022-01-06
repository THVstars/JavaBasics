package com.carolinasanchez;

public class Main {

    public static void main(String[] args) {

	    String firstName = "Carolina";
        String lastName = "Sanchez";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(createFullName("Carolina", "Sanchez"));

        System.out.println(NameGenerator.generateFullName("Carolina", "Sanchez"));
    }

    public static String createFullName(String first, String last) {
        return first + " " + last;
    }
}