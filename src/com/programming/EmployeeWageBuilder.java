package com.programming;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    public static final int wagePerHour = 20;


    public static void main(String[] args) {
        System.out.println("Welcome to employee computation program");
        int wage = 0;
        int workingHrs = 0;
        int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);

        switch (employeeCheck) {
            case isFullTime:
                workingHrs = 8;
                break;
            case isPartTime:
                workingHrs = 4;
                break;
            default:
                workingHrs = 0;
                System.out.println("Employee is absent");
        }
        wage = wagePerHour * workingHrs;
        System.out.println("Employee has earned " + wage );
    }
}
