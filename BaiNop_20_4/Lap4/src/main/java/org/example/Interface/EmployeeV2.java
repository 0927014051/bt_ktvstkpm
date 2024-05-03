package org.example.Interface;

public class EmployeeV2 {
    protected Long id;
    protected String fullName;

    public EmployeeV2(Long id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + fullName);
    }
}
