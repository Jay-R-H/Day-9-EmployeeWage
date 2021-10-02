package com.programming;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    /*Instance variables are created*/
    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    /*After creating the instance variable
     * a constructor is a must  */
    public EmployeeWageBuilder(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main(String[] args) {
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("D-Mart",20,7,10);
        EmployeeWageBuilder bigBazar = new EmployeeWageBuilder("Big-Bazar",22,10,20);
        EmployeeWageBuilder bigBasket = new EmployeeWageBuilder("Big-Basket",18,10,20 );
        System.out.println("The employee has  totally earned " + dMart.computeWage() + "$" + " working for the company " + dMart.company);
        System.out.println("The employee has  totally earned " + bigBazar.computeWage() + "$" + " working for the company " + bigBazar.company);
        System.out.println("The employee has  totally earned " + bigBasket.computeWage() + "$" + " working for the company " + bigBasket.company);

    }

    public int computeWage (){

        /*Local variables are declared*/
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;
        int totalWage = 0;
        int workingHrs;


        while (numOfWorkingDays > totalWorkingDays && maxHoursPerMonth > totalWorkingHrs) {
            int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
            totalWorkingDays++;
            /*switch case statement is used to check for the employer part time or full time working hours
            and also checking his presence to duty*/
            switch (employeeCheck) {

                case isFullTime:
                    workingHrs = 8;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
                case isPartTime:
                    workingHrs = 4;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
                default:
                    workingHrs = 0;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;
            }
            totalWorkingHrs += workingHrs;
            int wage = empRatePerHr * workingHrs;
            System.out.println("The employee has earned " + wage);
            totalWage += wage;
        }
        return totalWage;
    }
}
