package com.bridgelabz.coreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int i, j ,swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for i: ");
        i = sc.nextInt();

        System.out.println("Enter the value for j: ");
        j = sc.nextInt();
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("Values after swapping are i = " + i + " and j = " + j);
    }
}