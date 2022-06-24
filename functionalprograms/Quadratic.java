package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {


    public static void main(String[] args) {
        int a ,b, c ;
        double delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for variable a: ");
         a = sc.nextInt();
        System.out.println("Enter value for variable b: ");
         b = sc.nextInt();
        System.out.println("Enter value for variable c: ");
         c = sc.nextInt();

        System.out.println("Find root for equation: " + a + " x * x" + " + " + b + " x" + " + " + c);
        delta = (b * b) - 4 * a * c ;
        System.out.println("Delta value is : " + delta);
        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta)/(2*a);
        double root2 = (-b - sqrtDelta)/(2*a);
        System.out.println("Root of equation are: " + root1 + " and " + root2);
    }

}
