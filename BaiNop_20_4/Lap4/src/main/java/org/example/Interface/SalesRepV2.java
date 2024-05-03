package org.example.Interface;

public class SalesRepV2 extends EmployeeV2 implements IEmployee{
    private double basicSalary;
    private double kpiCurrent;
    private double kpiTarget;
    private double kpiFactor;
    public SalesRepV2(Long id, String fullName) {
        super(id, fullName);
    }

    public SalesRepV2(Long id, String fullName, double basicSalary, double kpiCurrent, double kpiTarget, double kpiFactor) {
        super(id, fullName);
        this.basicSalary = basicSalary;
        this.kpiCurrent = kpiCurrent;
        this.kpiTarget = kpiTarget;
        this.kpiFactor = kpiFactor;
    }

    @Override
    public double calculateMonthlyIncome() {
        return basicSalary + (kpiCurrent / kpiTarget) * kpiFactor;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getKpiCurrent() {
        return kpiCurrent;
    }

    public void setKpiCurrent(double kpiCurrent) {
        this.kpiCurrent = kpiCurrent;
    }

    public double getKpiTarget() {
        return kpiTarget;
    }

    public void setKpiTarget(double kpiTarget) {
        this.kpiTarget = kpiTarget;
    }

    public double getKpiFactor() {
        return kpiFactor;
    }

    public void setKpiFactor(double kpiFactor) {
        this.kpiFactor = kpiFactor;
    }
}
