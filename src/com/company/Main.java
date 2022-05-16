package com.company;

import com.company.model.Materials;
import com.company.model.type.Compulsory;
import com.company.model.type.Grade;
import com.company.model.type.House;
import com.company.years.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Main main = new Main();
        WhatYourLearn classes = new WhatYourLearn();
        System.out.println("Welcome to Hogwarts!");

        System.out.println("Let's guess your house.");
        System.out.println("What describes you best? Enter a number.");
        System.out.println("1. Courage, Bravery, Determination");
        System.out.println("2. Ambitious, Greatness");
        System.out.println("3. Wisdom, Wit");
        System.out.println("4. Humble, Trustworthy");
        Scanner houseScanner = new Scanner(System.in);
        int house = houseScanner.nextInt();
        switch (house) {
            case 1 -> System.out.printf("You may be in %s!%n", House.GRYFFINDOR);
            case 2 -> System.out.printf("You may be in %s!%n", House.SLYTHERIN);
            case 3 -> System.out.printf("You may be in %s!%n", House.RAVENCLAW);
            case 4 -> System.out.printf("You may be in %s!%n", House.HUFFLEPUFF);
        }

        Scanner yearScanner = new Scanner(System.in);
        System.out.println("Choose a Year you would like to know (1~7)");
        int year = yearScanner.nextInt();
        switch (year) {
            case 1 -> classes.firstYear();
            case 2 -> classes.secondYear();
            case 3 -> classes.thirdYear();
            case 4 -> classes.fourthYear();
            case 5 -> classes.fifthYear();
            case 6 -> classes.sixthYear();
            case 7 -> classes.seventhYear();
        }
    }
}
