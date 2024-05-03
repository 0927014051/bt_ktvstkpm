package org.example;

public class CategoryB implements SalaryCalculator {
    private static final double LuongCoBan = 1500;
    private static final double TangGio = 10;

    @Override
    public double getSalary() {
        return LuongCoBan + TangGio;
    }
}

