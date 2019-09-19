package com.LickingHeights;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    //declare
    Scanner keyboard;
        int inches,bmi,kg,pounds;
        double CONVERSION_IN_METERS =  0.0254, meters;

    //initializing
     keyboard = new Scanner (System.in);

     System.out.println("What is your height in inches");
     inches = keyboard.nextInt();
        meters=inches*0.0254;
     System.out.println();
     System.out.println("What is your weight in pounds");



    }
}
