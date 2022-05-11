package com.company.years;

import com.company.model.type.Compulsory;
import com.company.model.type.ISubjects;
import com.company.model.Materials;

import java.util.List;

public class FirstYears implements ISubjects {

    @Override
    public void takeTransfiguration(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Transfiguration Class");
    }

    @Override
    public void takeDADA(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Defence Against the Dark Arts Class");
    }

    @Override
    public void takeCharms(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Charms Class");
    }

    @Override
    public void takePotions(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Potions Class");
    }

    @Override
    public void takeAstronomy(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Astronomy Class");
    }

    @Override
    public void takeHistoryOfMagic(List<Materials> materials, Compulsory compulsory) {
        System.out.println("History of Magic Class");
    }

    @Override
    public void takeHerbology(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Herbology Class");
    }

    @Override
    public void takeFlying(List<Materials> materials, Compulsory compulsory) {
        System.out.println("Flying Class");
    }

    @Override
    public void takeArithmancy(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeMuggleStudies(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeDivination(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeAncientRunes(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeCareOfMagicalCreatures(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeAlchemy(List<Materials> materials, Compulsory compulsory) {}
    @Override
    public void takeApparation(List<Materials> materials, Compulsory compulsory) {}
}
