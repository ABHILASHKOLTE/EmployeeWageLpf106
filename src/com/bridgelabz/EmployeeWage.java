package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int Is_Full_Time =1;
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empWage = 0 ;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_Full_Time)
            empHrs = 8;
         else
            empHrs  = 0 ;
            empWage = empHrs * Emp_Rate_Per_Hour;
            System.out.println( "EmployeeWage" + empWage);


    }
}
