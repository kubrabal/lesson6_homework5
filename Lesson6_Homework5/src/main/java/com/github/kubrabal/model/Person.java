package com.github.kubrabal.model;

public class Person {
    private String firstName;
    private String lastName;
    private int daysWorked;
    private double salary;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public double getSalary() {
        return salary;
    }

    public void updateNumberOfDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void calculateSalary() {
        if (daysWorked > 22) {
            salary = 22 * 300 + ((daysWorked - 22) * 1000);
        } else {
            salary = daysWorked * 300;
        }
    }
}
