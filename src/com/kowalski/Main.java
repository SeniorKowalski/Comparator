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
        peoplesList.add(new Person("Elena","Hulio Santa Maria Gerra",21));
        peoplesList.add(new Person("Consuella","Bernard de la Gard",15));
        Collections.sort(peoplesList,Comparator.comparingInt(person -> {
            if (person.getSurnameWords()<3) {
                return person.getSurnameWords();
            }else return person.getAge();
        }));
        for (Person p : peoplesList){
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}
