package com.kowalski;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

    @Override
    public int compareTo(Person o) {

        if (this.getSurname().split("\\P{IsAlphabetic}+").length > o.getSurname().split("\\P{IsAlphabetic}+").length){
            return 1;
        } else if (this.getSurname().split("\\P{IsAlphabetic}+").length < o.getSurname().split("\\P{IsAlphabetic}+").length){
            return -1;
        } else {
            return Integer.compare(this.age,o.age);
        }
    }
}
