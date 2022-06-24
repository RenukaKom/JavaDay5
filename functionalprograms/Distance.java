package com.bridgelabz.functionalprograms;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value of co-ordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter y value of co-ordinate");
        int y = sc.nextInt();
        double distance = Math.sqrt(x * x + y * y);
        System.out.println(distance);
    }

}
