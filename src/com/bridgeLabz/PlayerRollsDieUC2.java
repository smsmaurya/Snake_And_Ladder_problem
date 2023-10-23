package com.bridgeLabz;

public class PlayerRollsDieUC2 {
    public static void main(String[] args) {
        System.out.println(" Start Snake and ladder game");
        int die = (int)(Math.random()*10)%6 +1;
        System.out.println("Player rolls the die : "+die);
    }
}
