package com.carolinasanchez.asktheuser;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byteQuestion();
        System.out.println(" ");
        shortQuestion();
        System.out.println(" ");
        intQuestion();
        System.out.println(" ");
        floatQuestion();
        System.out.println(" ");
        longQuestion();
        System.out.println(" ");
        doubleQuestion();
        System.out.println(" ");
        booleanQuestion();
        System.out.println(" ");
        stringQuestion();
    }

    public static void byteQuestion() {
        System.out.println("How many fingers do you have?");
        byte answerOne = scanner.nextByte();
        scanner.nextLine();
        System.out.println("I have " + answerOne + " fingers.");
    }

    public static void shortQuestion() {
        System.out.println("How much is 10000 + 20000?");
        short answerTwo = scanner.nextShort();
        scanner.nextLine();
        System.out.println("The answer is " + answerTwo + ".");
    }

    public static void intQuestion() {
        System.out.println("How much money do you need to be a millionaire?"); // If you type in the number with commas, the commas are ignored and the program still works!
        int answerThree = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You need $" + answerThree + " to be a millionaire.");
    }

    public static void floatQuestion() {
        System.out.println("How much is 3 divided by 2?");
        float answerFour = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("The answer is " + answerFour + ".");
    }

    public static void longQuestion() {
        System.out.println("How old is the universe?");
        long answerFive = scanner.nextLong();
        scanner.nextLine();
        System.out.println("The universe is " + answerFive + " years old.");
    }

    public static void doubleQuestion() {
        System.out.println("How much is 13.12345678 - 10?");
        double answerSix = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("The answer is " + answerSix + ".");
    }

    public static void booleanQuestion() {
        System.out.println("Please type true to indicate you're paying attention.");
        boolean answerSeven = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("It's " + answerSeven + " that I'm paying attention.");
    }

    public static void stringQuestion() {
        System.out.println("What's your name?");
        String answerEight = scanner.nextLine();
        System.out.println("My name is " + answerEight + ".");
    }
}
