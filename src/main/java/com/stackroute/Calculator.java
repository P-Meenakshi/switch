package com.stackroute;

import java.util.Scanner;

public class Calculator
{   // define,declare scanner and call getValues with scanner as parameter
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }
    //Get values and which operator from the menu
    public void getValues(Scanner scan){

    }
    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue ,int secondValue,int operator){
        return null;
    }
}
