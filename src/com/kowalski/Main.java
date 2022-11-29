package com.kowalski;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> peoplesList = new ArrayList<>();
        peoplesList.add(new Person("Benjamin","Franklin",55));
        peoplesList.add(new Person("John","Smith",45));
        peoplesList.add(new Person("Homer","Simpson",42));
        peoplesList.add(new Person("Helena","Bonem Carter",33));
        peoplesList.add(new Person("Cortney","Cox Arqette Anderson tree",37));
        peoplesList.add(new Person("Maria","Fon Der Berg Len",30));
        peoplesList.add(new Person("Elena","Hulio Santa Maria Gerra",17));
        peoplesList.add(new Person("Consuella","Bernard de la Gard",15));
        Collections.sort(peoplesList, new PersonSurnameWordsNumComparator(2));
        peoplesList.removeIf(person -> person.getAge()<18);
        for (Person p : peoplesList){
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}
