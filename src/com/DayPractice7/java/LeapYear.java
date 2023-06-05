package com.DayPractice7.java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year" );
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0 && year!=100||year%400==0)
        {
            System.out.println("Specified Year is Leap Year");
        }
else {
            System.out.println("Specified year is not Leap year");
        }
    }
}
