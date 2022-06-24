package com.bridgelabz.coreprograms;

public class HeadTailsPercentage {
    public static void main(String[] args) {
        int hcount = 0;
        int tcount = 0;
        for (int i=0; i<10; i++){
            int coin = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);

           // System.out.println("0 for Heads and 1 for Tails");
            System.out.println(coin);
            if (coin == 0) {
                System.out.println("It's Head");
                hcount++;
            } else{
                System.out.println("It's Tail");
                tcount++;
            }
        }System.out.println(hcount);
        int hpercent = ((hcount*100) / 10);
        System.out.println("Total percentage of head is : " + hpercent);

        System.out.println(tcount);
        int tpercent = ((tcount*100) /10);
        System.out.println("Total percentage of tail is : " + tpercent);
    }


}
