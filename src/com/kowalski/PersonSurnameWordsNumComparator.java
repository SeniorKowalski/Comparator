package com.kowalski;

import java.util.Comparator;

public class PersonSurnameWordsNumComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().split("\\P{IsAlphabetic}+").length > o2.getSurname().split("\\P{IsAlphabetic}+").length){
            return 1;
        } else if (o1.getSurname().split("\\P{IsAlphabetic}+").length < o2.getSurname().split("\\P{IsAlphabetic}+").length){
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
