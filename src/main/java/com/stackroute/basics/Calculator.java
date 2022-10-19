package com.stackroute.basics;
import java.util.Scanner;
public class Calculator {
    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c;
        do {
            new Calculator().getValues(scan);
            System.out.println("Do you want to try again(y/n)");
            c=scan.next().charAt(0);
       }while (c!='n' );

    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        System.out.println("Enter the first number");
        int firstValue = scan.nextInt();
        System.out.println("Enter the second number");
        int secondValue =  scan.nextInt();
        System.out.println("Enter number beside the operation to perform:\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.divide");
        int  operator= scan.nextInt();
        System.out.println(new Calculator().calculate(firstValue,secondValue,operator));
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        String output =" ";
            switch (operator) {
                case 1 :
                    output=firstValue+" "+ "+"+" "+secondValue +" "+ "="+" "+(firstValue+secondValue);
                    break;
                case 2:
                    output=firstValue+" "+ "-"+" "+secondValue + " "+"="+" "+(firstValue-secondValue);
                    break;
                case 3:
                    output =firstValue+" "+ "*"+" "+secondValue +" "+ "="+" "+(firstValue*secondValue);
                    break;
                case 4:
                    if (secondValue == 0) {
                        return ("The divider (secondValue) cannot be zero");
                    } else {
                        output= firstValue+" "+ "/"+" "+secondValue + " "+"="+" "+(firstValue/secondValue);
                    }
                    break;

                default:
                    if(operator>4){
                    output="Entered wrong option " + operator;}
                    break;
            }
        return output;
    }
}
