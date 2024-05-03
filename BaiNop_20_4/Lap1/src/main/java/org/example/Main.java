package org.example;



public class Main {
    public static void main(String[] args) {
        SalaryCalculator emlA = new CategoryA();
        SalaryCalculator emlB = new CategoryB();
        SalaryCalculator emlC = new CategoryC();
        System.out.println("Luong nhan vien loai A: " + emlA.getSalary());
        System.out.println("Luong nhan vien loai B: " + emlB.getSalary());
        System.out.println("Luong nhan vien loai C: " + emlC.getSalary());
    }
}
