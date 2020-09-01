package com.marketpulse.managers;

import com.marketpulse.models.Gender;
import com.marketpulse.models.Person;

import java.util.LinkedList;
import java.util.Queue;

public class FamilyTreeManager {

    public static int findNumberOfSons(Person root, String firstName, String lastName) {
        int numOfSons = 0;
        if (root == null)
            return 0;

        Queue<Person> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();

            while (n > 0) {
                Person p = q.peek();
                q.remove();
                if (p.getFirstName() == firstName && p.getLastName() == lastName) {
                    for (int i = 0; i < p.getChildrens().size(); i++) {
                        if (p.getChildrens().get(i).getGender() == Gender.MALE) {
                            numOfSons++;
                        }
                    }

                }

                for (int i = 0; i < p.getChildrens().size(); i++)
                    q.add(p.getChildrens().get(i));
                n--;
            }
        }
        return numOfSons;
    }

    public static int findNumberOfAllDaughters(Person root, String firstName, String lastName) {
        int numOfDaughters = 0;

        if (root == null)
            return 0;

        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(root);

        while (!personQueue.isEmpty()) {
            int n = personQueue.size();

            while (n > 0) {
                Person p = personQueue.peek();
                personQueue.remove();
                if (p.getFirstName() == firstName && p.getLastName() == lastName) {
                    for (int i = 0; i < p.getChildrens().size(); i++) {
                        if (p.getChildrens().get(i).getGender() == Gender.FEMALE) {
                            numOfDaughters++;
                        }
                        Person child = p.getChildrens().get(i);
                        if (child.getChildrens().size() > 0) {
                            numOfDaughters += findNumberOfAllDaughters(child, child.getFirstName(), child.getLastName());
                        }
                    }
                }

                for (int i = 0; i < p.getChildrens().size(); i++)
                    personQueue.add(p.getChildrens().get(i));
                n--;
            }
        }
        return numOfDaughters;
    }
}
