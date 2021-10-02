package com.programming;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int isPresent = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to employee computation program");
        int employeeCheck = (int) Math.floor((Math.random() * 10) % 2);

        if (employeeCheck == isPresent) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
