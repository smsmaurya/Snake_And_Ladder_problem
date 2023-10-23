package com.bridgeLabz;

public class CheckOptionOfPlayingUC3 {
    public static void main(String[] args) {
        int notPlay = 0;
        int useLadder = 1;
        int snakeBites = 2;
        int option = (int) (Math.random()*10)%3;
        if(option==notPlay){
            System.out.println("Player stays at the same position");
        } else if (option==useLadder) {
            System.out.println("the player moves ahead by the number of position received in the die");
        } else if (option==snakeBites) {
            System.out.println("the player moves behind by the number of position received in the die");
        }
    }
}
