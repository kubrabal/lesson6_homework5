package com.github.kubrabal;

import com.github.kubrabal.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        person.updateNumberOfDaysWorked(30);
        person.calculateSalary();
        System.out.println(person.getFirstName() + " Maaş:" + person.getSalary());
    }
}