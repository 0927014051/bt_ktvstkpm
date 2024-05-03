package org.example.Abstract;

public class Consultant extends Employee {
    private double hoursWorked;
    private double hoursRate;

    public Consultant(Long id, String fullName) {
        super(id, fullName);
    }

    public Consultant(Long id, String fullName, double hoursWorked, double hoursRate) {
        super(id, fullName);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    @Override
    public String toString() {
        return "Consultant{" +
                ", id=" + id +
                ", fullName='" + fullName +
                "hoursWorked=" + hoursWorked +
                ", hoursRate=" + hoursRate +
                '}';
    }

    @Override
    public double calculateMonthlyIncome() {
        return this.hoursRate * this.hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(double hoursRate) {
        this.hoursRate = hoursRate;
    }
}
