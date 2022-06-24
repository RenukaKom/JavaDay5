package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2 ,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();
        if(num1 > num2 && num1 >num3){
            System.out.println("First number " + num1 + " is largest among all three numbers");
        } else if (num2 > num1 && num2 >num3){
            System.out.println("Second number " + num2 + " is largest among all three numbers");
        } else{
            System.out.println("Third number "+ num3 + " is largest among all three numbers");
        }
    }
}

