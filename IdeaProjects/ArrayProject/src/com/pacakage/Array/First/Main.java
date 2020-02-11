package com.pacakage.Array.First;


import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        System.out.println("Welcome to the Data Center !!!");
        System.out.println("Here is the Store Information ");
        System.out.println("If you are Human, Please type Any Key to Proceed");
        //System.out.println("Enter either"+", "+ "Employee Info"+", "+ "Store Revenue " +", "+ "Store Expenses"+", "+ "Store Profit" );
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine ();


        Calculate print1 = new Calculate();
        print1.employeeList();
        print1.Revenue();
        print1.expense();
        print1.profit();

        //String []  employeeName = { "Kathy", "sam" , "john"};
        //int [] employeeId = {2001, 2002, 2003 };
        //int[] salary= {40000, 45000,39000 };

       /* int[] employeeId;
        employeeId = new int[3];
        employeeId[0] = 2001;
        employeeId[1] = 2002;
        employeeId[2] = 2003;
        //int[] id = new int[]{ 1,2,3};
        */




        



    }


}
