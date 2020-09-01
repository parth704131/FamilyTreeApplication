package com.marketpulse;

import com.marketpulse.managers.FamilyTreeManager;
import com.marketpulse.models.Gender;
import com.marketpulse.models.Person;

public class FamilyTreeApplication {
    public static void main(String[] args) throws Exception {

        Person john = FamilyTreeManager.createPerson("John", "Sakespeare", Gender.MALE);
        Person mary = FamilyTreeManager.createPerson("Mary", "Arden", Gender.FEMALE);

        Person joan = FamilyTreeManager.createPerson("Joan", "Sakespeare", Gender.FEMALE);
        Person marget = FamilyTreeManager.createPerson("Marget", "Sakespeare", Gender.FEMALE);
        Person william = FamilyTreeManager.createPerson("William", "Sakespeare", Gender.MALE);

        Person susana = FamilyTreeManager.createPerson("Susana", "Sakesspeare", Gender.FEMALE);

        FamilyTreeManager.addRelationBetweenTwoPerson(john, joan);
        FamilyTreeManager.addRelationBetweenTwoPerson(john, marget);
        FamilyTreeManager.addRelationBetweenTwoPerson(john, william);
        FamilyTreeManager.addRelationBetweenTwoPerson(william, susana);

        int numOfSons = FamilyTreeManager.findNumberOfSons(john, "John", "Sakespeare");
        System.out.println(numOfSons);

        int numOfDaughters = FamilyTreeManager.findNumberOfAllDaughters(john, "John", "Sakespeare");
        System.out.println(numOfDaughters);
    }
}
