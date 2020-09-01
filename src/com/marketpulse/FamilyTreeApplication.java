package com.marketpulse;

import com.marketpulse.dummies.DummyFamilyTree;
import com.marketpulse.managers.FamilyTreeManager;
import com.marketpulse.models.Person;

public class FamilyTreeApplication {
    public static void main(String[] args) {

        Person root= DummyFamilyTree.getDummyFamilyTree();
        int numOfSons = FamilyTreeManager.findNumberOfSons(root, "john", "sakes");
        System.out.println(numOfSons);

        int numOfDaughters =FamilyTreeManager.findNumberOfAllDaughters(root,"john","sakes");
        System.out.println(numOfDaughters);
    }
}
