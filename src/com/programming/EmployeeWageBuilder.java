package com.programming;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    public static final int wagePerHour = 20;
    public static final int totalWorkingDays = 20;
    public static  int totalWorkingHours = 100;


    public static void main(String[] args) {
        wageComputation();
    }
    public static void wageComputation(){
        System.out.println("Welcome to employee computation program");
        int wage = 0;
        int workingHrs = 0;
        int workingDays = 0;
        int totalWage = 0;

        while (totalWorkingDays > workingDays && totalWorkingHours>workingHrs) {
            int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
            workingDays++;
            switch (employeeCheck) {
                case isFullTime:
                    workingHrs = 8;
                    System.out.println("Employee has worked for " + workingHrs);
                    break;
                case isPartTime:
                    workingHrs = 4;
                    System.out.println("Employee has worked for " + workingHrs);
                    break;
                default:
                    workingHrs = 0;
                    System.out.println("Employee is absent");
            }
            totalWorkingHours+=workingHrs;
            wage = wagePerHour * workingHrs;
            totalWage += wage;
        }
        System.out.println("Employee has earned " + totalWage);
    }
}
