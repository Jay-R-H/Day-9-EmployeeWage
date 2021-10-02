package com.programming;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int isPresent = 1;
    public static final int wagePerHour =20;
    public static final int hoursPerDay =8;

    public static void main(String[] args) {
        System.out.println("Welcome to employee computation program");
        int wage=0;
        int employeeCheck = (int) Math.floor((Math.random() * 10) % 2);

        if (employeeCheck == isPresent) {
            System.out.println("Employee is present");
            wage=wagePerHour*hoursPerDay;
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee has earned " + wage);
    }
}
