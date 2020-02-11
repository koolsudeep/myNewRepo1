package com.pacakage.Array.First;

import com.sun.javafx.css.CalculatedValue;

import java.util.Arrays;

public class Calculate {



    String []  employeeName = {"Kathy", "Sam  ", "John "};
    int [] employeeId = {2001, 2002, 2003};
    int[] salary = {36000,40000,39000};
    int expense = 0;
    int revenue;

    public void employeeList(){

        for( int i=0; i <employeeId.length; i++) {
            System.out.println(employeeId[i]+ "(" + employeeName[i] + ")" + " Salary :   $" + salary[i]);

        }

    }


   /* public float getStoreRevenue() {
        return storeRevenue;
    }
    public float getOnlineRevenue() {
        return onlineRevenue;
        }

    */
        public void Revenue(){
            int storeRevenue= 500000;
            int onlineRevenue= 400000;
            revenue = storeRevenue + onlineRevenue;
            System.out.println( "Store revenue      :"+"   $" +revenue);


    }
    public void expense(){
        for( int i=0; i <employeeId.length; i++) {
            expense = expense + salary[i];
        }
        System.out.println("Store expenses     :"+"   $"+ expense);

    }
    public void profit(){
        System.out.println("Annual Store Profit:  "+" $"+(revenue - expense));

    }



}



