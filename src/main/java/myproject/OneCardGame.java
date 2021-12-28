package com.cindy;

import java.util.Random;

public class OneCardGame {
    public static void main(String[] args) {
        char[]types = {'c','d','h','s'};
        Random random=new Random();
        System.out.println("Computer's card");
        int computer = 15;
        int point =(computer+1)%13;
        int type =computer/13;
        System.out.println(point+" "+types[type]+"("+computer+")");
        int player = random.nextInt(52);
        int playerPoint = player%13+1;
        int playType= player/13;
        System.out.println(playerPoint+" "+types[playType]+"("+player+")");
        if (playerPoint>point||(playerPoint==point&&playType>type)){
            System.out.println("you win");
        } else{
            System.out.println("you loose");
        }
    }
}
