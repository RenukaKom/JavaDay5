package com.bridgelabz.coreprograms;
import java.util.*;
public class PrimeFactors {
    static int num;
        public static void primeFactors(int num)
        {
            int c = 2;
            System.out.println("Prime factors are: ");
            while (num > 1) {
                if (num % c == 0) {
                    System.out.print( c + " ");
                    num /= c;
                }
                else
                    c++;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to get prime factors: ");
            num = sc.nextInt();
            primeFactors(num);
        }
    }
