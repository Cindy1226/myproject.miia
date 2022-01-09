package com.cindy;

public class Sorting {
    public static void main(String[] args) {
        int [] n = {1,5,4,3,2};
        for (int i = 0; i < n.length-1; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i]<n[j]){
                    int o = n[i];
                    n[i]=n[j];
                    n[j]=o;

                }

            }
            System.out.println();

        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+",");

        }
    }
}
