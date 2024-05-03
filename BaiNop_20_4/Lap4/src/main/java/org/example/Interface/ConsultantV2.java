package org.example.Interface;

public class ConsultantV2 extends EmployeeV2 implements IEmployee{
    private double hoursWorked;
    private double hoursRate;
    public ConsultantV2(Long id, String fullName) {
        super(id, fullName);
    }

    public ConsultantV2(Long id, String fullName, double hoursWorked, double hoursRate) {
        super(id, fullName);
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    @Override
    public double calculateMonthlyIncome() {
        return this.hoursRate * this.hoursWorked;
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
}
