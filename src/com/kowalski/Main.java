package com.kowalski;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Person> peoples = new TreeSet<>();
        peoples.add(new Person("Benjamin","Franklin",55));
        peoples.add(new Person("John","Smith",45));
        peoples.add(new Person("Homer","Simpson",42));
        peoples.add(new Person("Helena","Bonem Carter",33));
        peoples.add(new Person("Cortney","Cox Arqette",37));
        peoples.add(new Person("Ursula","Fon Der Lainen",30));
        peoples.add(new Person("Elena","Hulio de Santa Maria Gerra",21));
        peoples.add(new Person("Consuella","Bernard de la Gard",15));
        for (Person p : peoples){
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
        List<Person> peoplesList = new ArrayList<>();
        peoplesList.add(new Person("Benjamin","Franklin",55));
        peoplesList.add(new Person("John","Smith",45));
        peoplesList.add(new Person("Homer","Simpson",42));
        peoplesList.add(new Person("Helena","Bonem Carter",33));
        peoplesList.add(new Person("Cortney","Cox Arqette Anderson tree",37));
        peoplesList.add(new Person("Ursula","Fon Der Berg Lainen",30));
        peoplesList.add(new Person("Elena","Hulio Santa Maria Gerra",21));
        peoplesList.add(new Person("Consuella","Bernard de la Gard",15));
        Collections.sort(peoplesList, new PersonSurnameWordsNumComparator());
        for (Person p : peoplesList){
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}
