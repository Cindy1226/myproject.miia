package com.cindy;

public class DiceCounter {
    public static void main(String[] args) {
        int[]counter = new int[6];
        for (int i = 0; i <10 ; i++) {
            Dice dice = new Dice();
            System.out.println(dice.point);
            System.out.println(dice.isMax()?"*":" ");
            counter[dice.point-1]++;

        }
        int max=0;
        int point=0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counter[i]);
            if (counter[i]>max){
                max=counter[i];
            }

        }
    }
}
