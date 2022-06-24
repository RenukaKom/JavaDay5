package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether even or odd: ");
        num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " number is Even");
            }else{
                System.out.println(num + " number is Odd");
            }

        }
    }

