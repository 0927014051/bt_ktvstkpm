package org.example;

public class CategoryC implements SalaryCalculator {
    private static final double LuongCoBan = 800;
    private static final double TangGio = 5;

    @Override
    public double getSalary() {
        return LuongCoBan + TangGio;
    }
}