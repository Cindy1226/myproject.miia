package com.cindy;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int[] drink={20,15,25};
        for (int i = 0; i < drink.length; i++) {
            System.out.println(drink[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while (!end){
            System.out.println("please put your coin in 1,5,10  total:"+total);
            String s = scanner.next();
            switch (s){
                case"1":
                case"5":
                case"10":
                    int n = Integer.parseInt(s);
                    total+=n;

                    break;
                case "0":
                    end = true;
                    break;
                case"a":
                case"b":
                case"c":
                    int index = s.charAt(0)-97;
                    if (total>drink[index]){
                        System.out.println("don!");
                        total-=drink[index];


                    }else{
                        System.out.println("beep");
                    }break;
                default:
                    System.out.println("wrong");
                    break;



            }
        }



    }
}
