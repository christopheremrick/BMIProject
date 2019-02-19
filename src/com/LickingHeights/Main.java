package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Feet to Meters is x/3.2808
    //Inches to Millimeters is x*25.4

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Please type your name...");
        String name = scan.nextLine();

        System.out.println("Well hello "+name+", it's nice to meet you. ");

        System.out.println("I'm here to calculate your BMI. Please type your height in feet.");
        System.out.println("Don't worry about inches, that is the next question.");
        Integer feet = scan.nextInt();

        System.out.println("Okay. Next type the remaining inches.");
        Integer inches = scan.nextInt();
        System.out.println("Next, please type your weight in pounds. Using decimals is fine.");
        Float weight = scan.nextFloat();

    // Calculations and output

        Double cm = (feet/3.2808)*100;  //Puts feet into cm

        Double cmInches = (inches*2.54); //Puts inches into cm

        Double heightcm = cm+cmInches;  //Adds the two together to get height in cm

        Double height = heightcm/100;   //Converts height in cm to meters

        Double kg = weight/2.2046;  //Converts weight in pounds to kg

        Double finalHeight = Math.pow(height, 2);   //Squares the total height

        Double bmi = kg/finalHeight;    //Calculates final BMI



        System.out.println("Okay, your BMI is "+ bmi);

    }
}
