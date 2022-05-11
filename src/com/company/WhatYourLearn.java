package com.company;

import com.company.model.Materials;
import com.company.model.type.Compulsory;
import com.company.model.type.Grade;
import com.company.years.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatYourLearn {
    List<Materials> materials = new ArrayList<>();
    public void firstYear(){
        FirstYears first = new FirstYears();
        first.takeTransfiguration(materials, Compulsory.REQUIRED);
        first.takeDADA(materials, Compulsory.REQUIRED);
        first.takeCharms(materials, Compulsory.REQUIRED);
        first.takePotions(materials, Compulsory.REQUIRED);
        first.takeAstronomy(materials, Compulsory.REQUIRED);
        first.takeHistoryOfMagic(materials, Compulsory.REQUIRED);
        first.takeHerbology(materials, Compulsory.REQUIRED);
        first.takeFlying(materials, Compulsory.REQUIRED);
    }
    public void secondYear(){
        SecondYears second = new SecondYears();
        second.takeTransfiguration(materials, Compulsory.REQUIRED);
        second.takeDADA(materials, Compulsory.REQUIRED);
        second.takeCharms(materials, Compulsory.REQUIRED);
        second.takePotions(materials, Compulsory.REQUIRED);
        second.takeAstronomy(materials, Compulsory.REQUIRED);
        second.takeHistoryOfMagic(materials, Compulsory.REQUIRED);
        second.takeHerbology(materials, Compulsory.REQUIRED);
        second.takeFlying(materials, Compulsory.OPTIONAL);
    }
    public void thirdYear(){
        ThirdYears third = new ThirdYears();
        third.takeTransfiguration(materials, Compulsory.REQUIRED);
        third.takeDADA(materials, Compulsory.REQUIRED);
        third.takeCharms(materials, Compulsory.REQUIRED);
        third.takePotions(materials, Compulsory.REQUIRED);
        third.takeAstronomy(materials, Compulsory.REQUIRED);
        third.takeHistoryOfMagic(materials, Compulsory.REQUIRED);
        third.takeHerbology(materials, Compulsory.REQUIRED);
        third.takeFlying(materials, Compulsory.OPTIONAL);
        System.out.println("---Must Choose at least 2 Subjects below---");
        third.takeArithmancy(materials, Compulsory.OPTIONAL);
        third.takeMuggleStudies(materials, Compulsory.OPTIONAL);
        third.takeDivination(materials, Compulsory.OPTIONAL);
        third.takeAncientRunes(materials, Compulsory.OPTIONAL);
        third.takeCareOfMagicalCreatures(materials, Compulsory.OPTIONAL);
    }
    public void fourthYear(){
        FourthYears fourth = new FourthYears();
        fourth.takeTransfiguration(materials, Compulsory.REQUIRED);
        fourth.takeDADA(materials, Compulsory.REQUIRED);
        fourth.takeCharms(materials, Compulsory.REQUIRED);
        fourth.takePotions(materials, Compulsory.REQUIRED);
        fourth.takeAstronomy(materials, Compulsory.REQUIRED);
        fourth.takeHistoryOfMagic(materials, Compulsory.REQUIRED);
        fourth.takeHerbology(materials, Compulsory.REQUIRED);
        fourth.takeFlying(materials, Compulsory.OPTIONAL);
        System.out.println("---Must Choose at least 2 Subjects below---");
        fourth.takeArithmancy(materials, Compulsory.OPTIONAL);
        fourth.takeMuggleStudies(materials, Compulsory.OPTIONAL);
        fourth.takeDivination(materials, Compulsory.OPTIONAL);
        fourth.takeAncientRunes(materials, Compulsory.OPTIONAL);
        fourth.takeCareOfMagicalCreatures(materials, Compulsory.OPTIONAL);
    }
    public void fifthYear(){
        FifthYears fifth = new FifthYears();
        fifth.takeTransfiguration(materials, Compulsory.REQUIRED);
        fifth.takeDADA(materials, Compulsory.REQUIRED);
        fifth.takeCharms(materials, Compulsory.REQUIRED);
        fifth.takePotions(materials, Compulsory.REQUIRED);
        fifth.takeAstronomy(materials, Compulsory.REQUIRED);
        fifth.takeHistoryOfMagic(materials, Compulsory.REQUIRED);
        fifth.takeHerbology(materials, Compulsory.REQUIRED);
        fifth.takeFlying(materials, Compulsory.OPTIONAL);
        System.out.println("---Must Choose at least 2 Subjects below---");
        fifth.takeArithmancy(materials, Compulsory.OPTIONAL);
        fifth.takeMuggleStudies(materials, Compulsory.OPTIONAL);
        fifth.takeDivination(materials, Compulsory.OPTIONAL);
        fifth.takeAncientRunes(materials, Compulsory.OPTIONAL);
        fifth.takeCareOfMagicalCreatures(materials, Compulsory.OPTIONAL);
        fifth.takeOWL();
    }
    public void sixthYear(){
        SixthYears sixth = new SixthYears();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your O.W.L grade: ");
        String year = scanner.next();
        sixth.setGrade(Grade.fromString(year));
        if(sixth.getGrade() == Grade.O || sixth.getGrade() == Grade.E || sixth.getGrade() == Grade.A){
            System.out.println("--Able to take ADVANCED classes below--");
        } else if(sixth.getGrade() == Grade.P || sixth.getGrade() == Grade.D || sixth.getGrade() == Grade.T){
            System.out.println("--Need to take classes below AGAIN--");
        }
        sixth.takeTransfiguration(materials, Compulsory.OPTIONAL);
        sixth.takeDADA(materials, Compulsory.OPTIONAL);
        sixth.takeCharms(materials, Compulsory.OPTIONAL);
        sixth.takePotions(materials, Compulsory.OPTIONAL);
        sixth.takeAstronomy(materials, Compulsory.OPTIONAL);
        sixth.takeHistoryOfMagic(materials, Compulsory.OPTIONAL);
        sixth.takeHerbology(materials, Compulsory.OPTIONAL);
        sixth.takeFlying(materials, Compulsory.OPTIONAL);
        sixth.takeArithmancy(materials, Compulsory.OPTIONAL);
        sixth.takeMuggleStudies(materials, Compulsory.OPTIONAL);
        sixth.takeDivination(materials, Compulsory.OPTIONAL);
        sixth.takeAncientRunes(materials, Compulsory.OPTIONAL);
        sixth.takeCareOfMagicalCreatures(materials, Compulsory.OPTIONAL);
        sixth.takeAlchemy(materials, Compulsory.OPTIONAL);
        sixth.takeApparation(materials, Compulsory.OPTIONAL);
    }
    public void seventhYear(){
        SeventhYears seventh = new SeventhYears();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your O.W.L grade: ");
        String year = scanner.next();
        seventh.setGrade(Grade.fromString(year));
        if(seventh.getGrade() == Grade.O || seventh.getGrade() == Grade.E || seventh.getGrade() == Grade.A){
            System.out.println("--Able to take ADVANCED classes below--");
        } else if(seventh.getGrade() == Grade.P || seventh.getGrade() == Grade.D || seventh.getGrade() == Grade.T){
            System.out.println("--Need to take classes below AGAIN--");
        }
        seventh.takeTransfiguration(materials, Compulsory.OPTIONAL);
        seventh.takeDADA(materials, Compulsory.OPTIONAL);
        seventh.takeCharms(materials, Compulsory.OPTIONAL);
        seventh.takePotions(materials, Compulsory.OPTIONAL);
        seventh.takeAstronomy(materials, Compulsory.OPTIONAL);
        seventh.takeHistoryOfMagic(materials, Compulsory.OPTIONAL);
        seventh.takeHerbology(materials, Compulsory.OPTIONAL);
        seventh.takeFlying(materials, Compulsory.OPTIONAL);
        seventh.takeArithmancy(materials, Compulsory.OPTIONAL);
        seventh.takeMuggleStudies(materials, Compulsory.OPTIONAL);
        seventh.takeDivination(materials, Compulsory.OPTIONAL);
        seventh.takeAncientRunes(materials, Compulsory.OPTIONAL);
        seventh.takeCareOfMagicalCreatures(materials, Compulsory.OPTIONAL);
        seventh.takeAlchemy(materials, Compulsory.OPTIONAL);
        seventh.takeApparation(materials, Compulsory.OPTIONAL);
        seventh.takeNEWT();
    }
}
