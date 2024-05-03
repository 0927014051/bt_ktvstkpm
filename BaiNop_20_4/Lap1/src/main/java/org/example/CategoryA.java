package org.example;

public class CategoryA implements SalaryCalculator {
    private static final double LuongCoBan = 2000;
    private static final double TangGio = 15;

    @Override
    public double getSalary() {
        return LuongCoBan + TangGio;
    }
}