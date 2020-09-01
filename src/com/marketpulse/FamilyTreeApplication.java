package com.marketpulse;

import com.marketpulse.managers.FamilyTreeManager;
import com.marketpulse.models.Gender;
import com.marketpulse.models.Person;

public class FamilyTreeApplication {
    public static void main(String[] args) {

        Person john = new Person("john", "sakes", Gender.MALE);
        Person maryArden = new Person("mary", "arden", Gender.FEMALE);

        Person joan = new Person("joan", "sakes", Gender.FEMALE, john);
        Person marget = new Person("marget", "sakes", Gender.FEMALE, joan);
        Person gillbert = new Person("gillbert", "sakes", Gender.MALE, john);
        Person joann = new Person("joann", "sakes", Gender.FEMALE, john);
        Person anne = new Person("anne", "sakes", Gender.FEMALE, john);
        Person richard = new Person("richard", "sakes", Gender.MALE, john);
        Person edmund = new Person("edmund", "sakes", Gender.MALE, john);
        Person willims = new Person("wilims", "sakes", Gender.MALE, john);


        john.getChildrens().add(joan);
        john.getChildrens().add(marget);
        john.getChildrens().add(gillbert);
        john.getChildrens().add(joann);
        john.getChildrens().add(anne);
        john.getChildrens().add(richard);
        john.getChildrens().add(edmund);
        john.getChildrens().add(willims);

        Person susanna = new Person("susanna", "sakes", Gender.FEMALE, willims);
        Person hamnet = new Person("hamnet", "sakes", Gender.MALE, willims);
        Person judith = new Person("judith", "sakes", Gender.FEMALE, willims);

        willims.getChildrens().add(susanna);
        willims.getChildrens().add(hamnet);
        willims.getChildrens().add(judith);

        Person elizabeth = new Person("elizabeth", "sakes", Gender.FEMALE);
        Person sakespeare = new Person("sakespeare", "sakes", Gender.MALE);
        Person thomas = new Person("thomas", "sakes", Gender.MALE);


        susanna.getChildrens().add(elizabeth);
        judith.getChildrens().add(sakespeare);
        judith.getChildrens().add(thomas);

        int numOfSons = FamilyTreeManager.findNumberOfSons(john, "john", "sakes");
        System.out.println(numOfSons);

    }
}
