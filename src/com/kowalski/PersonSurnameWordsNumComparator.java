package com.kowalski;

import java.util.Comparator;

public class PersonSurnameWordsNumComparator implements Comparator<Person> {
    int surnameWordNums;

    public PersonSurnameWordsNumComparator(int surnameWordNums) {
        this.surnameWordNums = surnameWordNums;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int o1Nums = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int o2Nums = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        if (o1Nums < surnameWordNums && o2Nums < surnameWordNums) {
            if (o1Nums > o2Nums) {
                return 1;
            } else if (o1Nums < o2Nums) {
                return -1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
