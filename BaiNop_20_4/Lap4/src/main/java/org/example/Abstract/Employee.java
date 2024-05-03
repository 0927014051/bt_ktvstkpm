package org.example.Abstract;

public abstract class Employee {
    protected Long id;
    protected String fullName;

    public Employee(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + fullName);
    }

    public abstract double calculateMonthlyIncome();
}
