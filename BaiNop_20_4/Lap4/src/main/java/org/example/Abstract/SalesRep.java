package org.example.Abstract;

public class SalesRep extends Employee{
    private double basicSalary;
    private double kpiCurrent;
    private double kpiTarget;
    private double kpiFactor;

    public SalesRep(Long id, String fullName) {
        super(id, fullName);
    }

    public SalesRep(Long id, String fullName, double basicSalary, double kpiCurrent, double kpiTarget, double kpiFactor) {
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

    @Override
    public String toString() {
        return
                "SalesRep{" +
                " id=" + id +
                ", fullName='" + fullName +
                "basicSalary=" + basicSalary +
                ", kpiCurrent=" + kpiCurrent +
                ", kpiTarget=" + kpiTarget +
                ", kpiFactor=" + kpiFactor +
                '}';
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
