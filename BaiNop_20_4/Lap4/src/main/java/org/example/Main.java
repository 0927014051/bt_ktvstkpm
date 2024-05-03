package org.example;

import org.example.Abstract.Consultant;
import org.example.Abstract.Employee;
import org.example.Abstract.SalesRep;
import org.example.Interface.ConsultantV2;
import org.example.Interface.SalesRepV2;

public class Main {
    public static void main(String[] args) {
        Long emp1ID = 1L;
        String emp1Name = "Nguyen Van Thuan";
        double hoursWorked = 100;
        double hoursRate = 100;

        Long emp2ID = 2L;
        String emp2Name = "Tran Thi Xuan Huyen";
        double basicSalary = 100;
        double kpiCurrent = 90;
        double kpiTarget = 100;
        double kpiFactor = 100;


        System.out.println("-------Use abstract--------");

        Employee emplConsultant = new Consultant(emp1ID, emp1Name, hoursWorked, hoursRate);
        System.out.println(emplConsultant.toString());
        System.out.println("MonthlyIncome: " + emplConsultant.calculateMonthlyIncome());

        System.out.println();

        Employee emplSalesRep = new SalesRep(emp2ID, emp2Name, basicSalary, kpiCurrent, kpiTarget, kpiFactor);
        System.out.println(emplSalesRep.toString());
        System.out.println("MonthlyIncome: " + emplSalesRep.calculateMonthlyIncome());

        System.out.println("-------Use interface--------");

        ConsultantV2 emplConsultant2 = new ConsultantV2(emp1ID, emp1Name, hoursWorked, hoursRate);
        System.out.println(emplConsultant2.toString());
        System.out.println("MonthlyIncome: " + emplConsultant2.calculateMonthlyIncome());

        System.out.println();

        SalesRepV2 emplSalesRep2 = new SalesRepV2(emp2ID, emp2Name, basicSalary, kpiCurrent, kpiTarget, kpiFactor);
        System.out.println(emplSalesRep2.toString());
        System.out.println("MonthlyIncome: " + emplSalesRep2.calculateMonthlyIncome());

    }
}