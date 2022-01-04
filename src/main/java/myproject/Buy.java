package com.cindy;

import java.util.Scanner;

public class Buy {
    public static void main(String[] args) {
        int n=-1;
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        while (n!=0){

            System.out.println("buy item:");
            System.out.println("1)Dress ");
            System.out.println("2)Sox");
            System.out.println("3)Shoes");
            System.out.println("0)Exit");
            String  s =scanner.next();
            int num=Integer.parseInt(s);
            switch (s){
                case "1":
                    total+=500;
                    break;
                case "2":
                    total+=450;
                    break;
                case"3":
                    total+=350;
                    break;



            }

            if(num==0){
                n++;
                System.out.println("total:"+total);
            }


        }
        if (total>1000){
            System.out.println(total*0.9);
        }

        }
    }
